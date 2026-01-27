package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(351.9f, 280.0f)
                lineToRelative(-190.9f, 0.0f)
                curveToRelative(2.9f, 64.5f, 17.2f, 123.9f, 37.5f, 167.4f)
                curveToRelative(11.4f, 24.5f, 23.7f, 41.8f, 35.1f, 52.4f)
                curveToRelative(11.2f, 10.5f, 18.9f, 12.2f, 22.9f, 12.2f)
                reflectiveCurveToRelative(11.7f, -1.7f, 22.9f, -12.2f)
                curveToRelative(11.4f, -10.6f, 23.7f, -28.0f, 35.1f, -52.4f)
                curveToRelative(20.3f, -43.5f, 34.6f, -102.9f, 37.5f, -167.4f)
                close()
                moveTo(160.9f, 232.0f)
                lineToRelative(190.9f, 0.0f)
                curveTo(349.0f, 167.5f, 334.7f, 108.1f, 314.4f, 64.6f)
                curveTo(303.0f, 40.2f, 290.7f, 22.8f, 279.3f, 12.2f)
                curveTo(268.1f, 1.7f, 260.4f, 0.0f, 256.4f, 0.0f)
                reflectiveCurveToRelative(-11.7f, 1.7f, -22.9f, 12.2f)
                curveToRelative(-11.4f, 10.6f, -23.7f, 28.0f, -35.1f, 52.4f)
                curveToRelative(-20.3f, 43.5f, -34.6f, 102.9f, -37.5f, 167.4f)
                close()
                moveTo(112.9f, 232.0f)
                curveTo(116.4f, 146.4f, 138.5f, 66.9f, 170.8f, 14.7f)
                curveTo(78.7f, 47.3f, 10.9f, 131.2f, 1.5f, 232.0f)
                lineToRelative(111.4f, 0.0f)
                close()
                moveTo(1.5f, 280.0f)
                curveToRelative(9.4f, 100.8f, 77.2f, 184.7f, 169.3f, 217.3f)
                curveToRelative(-32.3f, -52.2f, -54.4f, -131.7f, -57.9f, -217.3f)
                lineTo(1.5f, 280.0f)
                close()
                moveTo(399.9f, 280.0f)
                curveToRelative(-3.5f, 85.6f, -25.6f, 165.1f, -57.9f, 217.3f)
                curveToRelative(92.1f, -32.7f, 159.9f, -116.5f, 169.3f, -217.3f)
                lineToRelative(-111.4f, 0.0f)
                close()
                moveTo(511.3f, 232.0f)
                curveTo(501.9f, 131.2f, 434.1f, 47.3f, 342.0f, 14.7f)
                curveTo(374.3f, 66.9f, 396.4f, 146.4f, 399.9f, 232.0f)
                lineToRelative(111.4f, 0.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
