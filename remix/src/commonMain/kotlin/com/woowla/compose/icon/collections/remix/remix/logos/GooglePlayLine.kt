package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GooglePlayLine: ImageVector
    get() {
        if (_googlePlayLine != null) {
            return _googlePlayLine!!
        }
        _googlePlayLine = Builder(name = "GooglePlayLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 1.734f)
                curveTo(4.177f, 1.734f, 4.35f, 1.781f, 4.502f, 1.869f)
                lineTo(20.506f, 11.134f)
                curveTo(20.984f, 11.411f, 21.147f, 12.023f, 20.871f, 12.501f)
                curveTo(20.783f, 12.652f, 20.657f, 12.778f, 20.506f, 12.865f)
                lineTo(4.502f, 22.131f)
                curveTo(4.024f, 22.408f, 3.412f, 22.244f, 3.136f, 21.767f)
                curveTo(3.047f, 21.614f, 3.001f, 21.441f, 3.001f, 21.265f)
                verticalLineTo(2.734f)
                curveTo(3.001f, 2.182f, 3.449f, 1.734f, 4.001f, 1.734f)
                close()
                moveTo(12.293f, 13.413f)
                lineTo(7.795f, 17.912f)
                lineTo(13.494f, 14.613f)
                lineTo(12.293f, 13.413f)
                close()
                moveTo(5.0f, 6.119f)
                verticalLineTo(17.878f)
                lineTo(10.879f, 11.999f)
                lineTo(5.0f, 6.119f)
                close()
                moveTo(15.284f, 10.421f)
                lineTo(13.707f, 11.999f)
                lineTo(15.285f, 13.576f)
                lineTo(18.009f, 12.0f)
                lineTo(15.284f, 10.421f)
                close()
                moveTo(7.794f, 6.085f)
                lineTo(12.293f, 10.585f)
                lineTo(13.493f, 9.384f)
                lineTo(7.794f, 6.085f)
                close()
            }
        }
        .build()
        return _googlePlayLine!!
    }

private var _googlePlayLine: ImageVector? = null
