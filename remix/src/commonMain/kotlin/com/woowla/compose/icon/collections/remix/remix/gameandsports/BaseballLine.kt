package com.woowla.compose.icon.collections.remix.remix.gameandsports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.GameAndSportsGroup

public val GameAndSportsGroup.BaseballLine: ImageVector
    get() {
        if (_baseballLine != null) {
            return _baseballLine!!
        }
        _baseballLine = Builder(name = "BaseballLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.204f, 2.399f)
                curveTo(11.728f, 1.664f, 14.541f, 1.92f, 17.0f, 3.339f)
                curveTo(19.458f, 4.759f, 21.086f, 7.067f, 21.712f, 9.621f)
                curveTo(22.304f, 12.035f, 22.001f, 14.676f, 20.66f, 17.0f)
                curveTo(19.318f, 19.323f, 17.182f, 20.906f, 14.795f, 21.601f)
                curveTo(12.271f, 22.336f, 9.458f, 22.079f, 6.999f, 20.66f)
                curveTo(4.541f, 19.24f, 2.913f, 16.933f, 2.287f, 14.379f)
                curveTo(1.695f, 11.965f, 1.998f, 9.323f, 3.339f, 6.999f)
                curveTo(4.681f, 4.676f, 6.817f, 3.094f, 9.204f, 2.399f)
                close()
                moveTo(16.0f, 5.072f)
                curveTo(14.314f, 4.099f, 12.423f, 3.809f, 10.644f, 4.116f)
                curveTo(10.943f, 6.247f, 10.561f, 8.491f, 9.402f, 10.5f)
                curveTo(8.243f, 12.507f, 6.489f, 13.96f, 4.495f, 14.766f)
                curveTo(5.118f, 16.461f, 6.314f, 17.955f, 7.999f, 18.928f)
                curveTo(9.685f, 19.901f, 11.576f, 20.19f, 13.355f, 19.882f)
                curveTo(13.056f, 17.752f, 13.439f, 15.507f, 14.598f, 13.5f)
                curveTo(15.757f, 11.492f, 17.51f, 10.038f, 19.504f, 9.232f)
                curveTo(18.881f, 7.537f, 17.685f, 6.045f, 16.0f, 5.072f)
                close()
                moveTo(19.961f, 11.21f)
                curveTo(18.487f, 11.875f, 17.2f, 12.991f, 16.33f, 14.5f)
                curveTo(15.459f, 16.007f, 15.135f, 17.679f, 15.296f, 19.289f)
                curveTo(16.771f, 18.623f, 18.058f, 17.507f, 18.928f, 16.0f)
                curveTo(19.799f, 14.491f, 20.123f, 12.819f, 19.961f, 11.21f)
                close()
                moveTo(8.703f, 4.709f)
                curveTo(7.228f, 5.375f, 5.942f, 6.492f, 5.072f, 7.999f)
                curveTo(4.201f, 9.507f, 3.878f, 11.179f, 4.039f, 12.789f)
                curveTo(5.513f, 12.123f, 6.799f, 11.007f, 7.669f, 9.5f)
                curveTo(8.54f, 7.991f, 8.864f, 6.319f, 8.703f, 4.709f)
                close()
            }
        }
        .build()
        return _baseballLine!!
    }

private var _baseballLine: ImageVector? = null
