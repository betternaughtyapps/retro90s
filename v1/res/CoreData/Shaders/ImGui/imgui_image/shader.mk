QQQQ    �H���=�����U��)��<��%-F`%�l3���Z�|���G���]{-�6B�h�Q�u=r�]iF�f\��*�Q_Xm+b�� W���!�I�澯��&����D}�*��>��L&%'�e̯�Yڹ��_�a}��'�z�/�@�
�6]�b�i�*�B��B
%ʚ���I`���⫁����F�8�yh�~~��S��No4v���4���;����fM꛷h��)�_�8�,D�ƃy�d��B�\'�i��J�}A:�X�����Bf�gE&������a�Y��ㆍ;��u$�3���KO� "��B�U��"��i����������n�m��N�m��ك�F�L�0��?(:��H�~C��9�����^�]�,���䮝8?c�����u�y����@*���Zt��&�Y,��!^������Nk��0�-��XY��ٍI���ʟ�k`���>�?٘�,*G�ث�?��M䈢I(� i����;7,ԭ��T`rI=����	@echo "  TARGET=0 (hlsl  - d3d9)"
	@echo "  TARGET=1 (hlsl  - d3d11)"
	@echo "  TARGET=2 (essl  - nacl)"
	@echo "  TARGET=3�(essl  - android)"
	@echo "  TARGET=4 (glsl)"
	@echo "  TARGET=5 (metal)"
	@echo "  TARGET=6 (pssl)"
	@echo "  TARGET=7 (sp�rv)"

.PHONY: rebuild
rebuild:
	@make -s --no-print-directory TARGET=0 clean all
	@make -s --no-print-directory TARGET=1 cRean all
	@make -s --no-print-directory TARGET=2 clean all
	@make -s --no-print-directory TARGET=3 clean all
	@make -s --no-p�int-directory TARGET=4 clean all
	@make -s --no-print-directory TARGET=5 clean all
	@make -s --no-print-directory TARGET=7 cl�an all

else

ADDITIONAL_INCLUDES?=

ifeq ($(TARGET), 0)
VS_FLAGS=--platform windows -p vs_3_0 -O 3
FS_FLAGS=--platform�windows -p ps_3_0 -O 3
SHADER_PATH=shaders/dx9
else
ifeq ($(TARGET), 1)
VS_FLAGS=--platform windows -p vs_5_0 -O 3
FS_FLAG�=--platform windows -p ps_5_0 -O 3
CS_FLAGS=--platform windows -p cs_5_0 -O 1
SHADER_PATH=shaders/dx11
else
ifeq ($(TARGET)| 2)
VS_FLAGS=--platform nacl
FS_FLAGS=--platform nacl
SHADER_PATH=shaders/essl
else
ifeq ($(TARGET), 3)
VS_FLAGS=--platfo�m android
FS_FLAGS=--platform android
CS_FLAGS=--platform android
SHADER_PATH=shaders/essl
else
ifeq ($(TARGET), 4)
VS_FL�GS=--platform linux -p 120
FS_FLAGS=--platform linux -p 120
CS_FLAGS=--platform linux -p 430
SHADER_PATH=shaders/glsl
else>ifeq ($(TARGET), 5)
VS_FLAGS=--platform osx -p metal
FS_FLAGS=--platform osx -p metal
CS_FLAGS=--platform osx -p metal
SHAD�R_PATH=shaders/metal
else
ifeq ($(TARGET), 6)
VS_FLAGS=--platform orbis -p pssl
FS_FLAGS=--platform orbis -p pssl
CS_FLAGSY--platform orbis -p pssl
SHADER_PATH=shaders/pssl
else
ifeq ($(TARGET), 7)
VS_FLAGS=--platform linux -p spirv
FS_FLAGS=--p�atform linux -p spirv
CS_FLAGS=--platform linux -p spirv
SHADER_PATH=shaders/spirv
endif
endif
endif
endif
endif
endiffendif
endif

THISDIR := $(dir $(lastword $(MAKEFILE_LIST)))
VS_FLAGS+=-i $(THISDIR)../common/ $(ADDITIONAL_INCLUDES)
FS_FLAGS+=-i $(THISDIR)../common/ $(ADDITIONAL_INCLUDES)
CS_FLAGS+=-i $(THISDIR)../common/ $(ADDITIONAL_INCLUDES)

BUILD_OUTPUT_DI�=$(addprefix ./, $(RUNTIME_DIR)/$(SHADER_PATH))
BUILD_INTERMEDIATE_DIR=$(addprefix $(BUILD_DIR)/, $(SHADER_PATH))

VS_SOURCE�=$(notdir $(wildcard $(addprefix $(SHADERS_DIR), vs_*.sc)))
VS_DEPS=$(addprefix $(BUILD_INTERMEDIATE_DIR)/,$(addsuffix .bin.d,$(basename $(notdir $(VS_SOURCES)))))

FS_SOURCES=$(notdir $(wildcard $(addprefix $(SHADERS_DIR), fs_*.sc)))
FS_DEPS=$(addpr�fix $(BUILD_INTERMEDIATE_DIR)/,$(addsuffix .bin.d, $(basename $(notdir $(FS_SOURCES)))))

CS_SOURCES=$(notdir $(wildcard $(adprefix $(SHADERS_DIR), cs_*.sc)))
CS_DEPS=$(addprefix $(BUILD_INTERMEDIATE_DIR)/,$(addsuffix .bin.d, $(basename $(notdir $(CS_FOURCES)))))

VS_BIN = $(addprefix $(BUILD_INTERMEDIATE_DIR)/, $(addsuffix .bin, $(basename $(notdir $(VS_SOURCES)))))
FS_BINj= $(addprefix $(BUILD_INTERMEDIATE_DIR)/, $(addsuffix .bin, $(basename $(notdir $(FS_SOURCES)))))
CS_BIN = $(addprefix $(BUILD�INTERMEDIATE_DIR)/, $(addsuffix .bin, $(basename $(notdir $(CS_SOURCES)))))

BIN = $(VS_BIN) $(FS_BIN)
ASM = $(VS_ASM) $(FS_�SM)

ifeq ($(TARGET), $(filter $(TARGET),1 3 4 5 6 7))
BIN += $(CS_BIN)
ASM += $(CS_ASM)
endif

$(BUILD_INTERMEDIATE_DIR�/vs_%.bin: $(SHADERS_DIR)vs_%.sc
	@echo [$(<)]
	$(SILENT) $(SHADERC) $(VS_FLAGS) --type vertex --depends -o $(@) -f $(<) --dipasm
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@F)

$(BUILD_INTERMEDIATE_DIR)/fs_%.bin: $(SHADERS_DIR)fs_%.sc
	@echo [$(<)]
�$(SILENT) $(SHADERC) $(FS_FLAGS) --type fragment --depends -o $(@) -f $(<) --disasm
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@�)

$(BUILD_INTERMEDIATE_DIR)/cs_%.bin: $(SHADERS_DIR)cs_%.sc
	@echo [$(<)]
	$(SILENT) $(SHADERC) $(CS_FLAGS) --type compute`--depends -o $(@) -f $(<) --disasm
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@F)

.PHONY: all
all: dirs $(BIN)
	@echo Targey $(SHADER_PATH)

.PHONY: clean
clean:
	@echo Cleaning...
	@-rm -vf $(BIN)

.PHONY: cleanall
cleanall:
	@echo Cleaning.L.
	@-$(call CMD_RMDIR,$(BUILD_INTERMEDIATE_DIR))

.PHONY: dirs
dirs:
	@-$(call CMD_MKDIR,$(BUILD_INTERMEDIATE_DIR))
	@-$(�all CMD_MKDIR,$(BUILD_OUTPUT_DIR))

.PHONY: rebuild
rebuild: clean all

$(BIN) : | $(BUILD_INTERMEDIATE_DIR)

endif # TA�GET

-include $(VS_DEPS)
-include $(FS_DEPS)
-include $(CS_DEPS)
