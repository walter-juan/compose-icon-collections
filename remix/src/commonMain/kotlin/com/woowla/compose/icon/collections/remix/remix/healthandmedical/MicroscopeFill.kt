package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.MicroscopeFill: ImageVector
    get() {
        if (_microscopeFill != null) {
            return _microscopeFill!!
        }
        _microscopeFill = Builder(name = "MicroscopeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.196f, 2.268f)
                lineTo(16.446f, 7.897f)
                curveTo(16.722f, 8.375f, 16.558f, 8.987f, 16.08f, 9.263f)
                lineTo(14.781f, 10.012f)
                lineTo(15.781f, 11.745f)
                lineTo(14.049f, 12.745f)
                lineTo(13.049f, 11.012f)
                lineTo(11.75f, 11.763f)
                curveTo(11.272f, 12.039f, 10.66f, 11.875f, 10.384f, 11.397f)
                lineTo(8.546f, 8.215f)
                curveTo(6.494f, 8.837f, 5.0f, 10.744f, 5.0f, 13.0f)
                curveTo(5.0f, 13.625f, 5.115f, 14.224f, 5.324f, 14.776f)
                curveTo(6.099f, 14.284f, 7.016f, 14.0f, 8.0f, 14.0f)
                curveTo(9.684f, 14.0f, 11.174f, 14.833f, 12.08f, 16.109f)
                lineTo(19.768f, 11.67f)
                lineTo(20.768f, 13.403f)
                lineTo(12.89f, 17.951f)
                curveTo(12.962f, 18.289f, 13.0f, 18.64f, 13.0f, 19.0f)
                curveTo(13.0f, 19.343f, 12.965f, 19.677f, 12.9f, 20.001f)
                lineTo(21.0f, 20.0f)
                verticalLineTo(22.0f)
                lineTo(4.001f, 22.001f)
                curveTo(3.372f, 21.165f, 3.0f, 20.126f, 3.0f, 19.0f)
                curveTo(3.0f, 17.993f, 3.298f, 17.055f, 3.81f, 16.27f)
                curveTo(3.293f, 15.295f, 3.0f, 14.182f, 3.0f, 13.0f)
                curveTo(3.0f, 10.005f, 4.881f, 7.449f, 7.527f, 6.449f)
                lineTo(7.134f, 5.768f)
                curveTo(6.582f, 4.811f, 6.909f, 3.588f, 7.866f, 3.036f)
                lineTo(10.464f, 1.536f)
                curveTo(11.421f, 0.984f, 12.644f, 1.311f, 13.196f, 2.268f)
                close()
            }
        }
        .build()
        return _microscopeFill!!
    }

private var _microscopeFill: ImageVector? = null
