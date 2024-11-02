package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Lotpolishairlines: ImageVector
    get() {
        if (_lotpolishairlines != null) {
            return _lotpolishairlines!!
        }
        _lotpolishairlines = Builder(name = "Lotpolishairlines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.375f, 0.0f, 0.0f, 5.375f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.375f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.375f, 12.0f, -12.0f)
                reflectiveCurveTo(18.625f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(0.744f, 12.0f)
                curveTo(0.744f, 5.779f, 5.779f, 0.744f, 12.0f, 0.744f)
                curveToRelative(1.287f, 0.0f, 2.511f, 0.227f, 3.659f, 0.618f)
                lineTo(9.388f, 13.931f)
                lineTo(1.275f, 15.407f)
                arcTo(11.256f, 11.256f, 0.0f, false, true, 0.744f, 12.0f)
                close()
                moveTo(12.0f, 23.256f)
                curveToRelative(-4.997f, 0.0f, -9.237f, -3.268f, -10.7f, -7.773f)
                horizontalLineToRelative(7.836f)
                lineToRelative(7.079f, 6.953f)
                curveToRelative(-1.3f, 0.517f, -2.726f, 0.82f, -4.214f, 0.82f)
                close()
                moveTo(16.227f, 22.423f)
                arcToRelative(2.246f, 2.246f, 0.0f, false, false, 0.631f, -1.565f)
                curveToRelative(0.0f, -0.707f, -0.328f, -1.35f, -0.845f, -1.754f)
                lineToRelative(-4.732f, -3.621f)
                horizontalLineToRelative(11.42f)
                curveToRelative(-1.035f, 3.155f, -3.419f, 5.703f, -6.473f, 6.94f)
                close()
                moveTo(21.388f, 14.334f)
                horizontalLineToRelative(-2.7f)
                lineToRelative(0.202f, 0.29f)
                horizontalLineToRelative(0.921f)
                lineToRelative(0.467f, 0.568f)
                horizontalLineToRelative(-5.085f)
                curveToRelative(0.0f, -1.009f, -0.82f, -1.842f, -1.842f, -1.842f)
                curveToRelative(-0.101f, 0.0f, -0.202f, 0.013f, -0.29f, 0.025f)
                lineToRelative(-1.83f, 0.278f)
                lineToRelative(5.401f, -8.984f)
                curveToRelative(0.215f, -0.353f, 0.328f, -0.757f, 0.328f, -1.186f)
                curveToRelative(0.0f, -0.909f, -0.505f, -1.716f, -1.249f, -2.095f)
                curveTo(20.101f, 2.915f, 23.256f, 7.079f, 23.256f, 12.0f)
                curveToRelative(0.0f, 1.11f, -0.164f, 2.183f, -0.467f, 3.192f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.401f, -0.858f)
                close()
            }
        }
        .build()
        return _lotpolishairlines!!
    }

private var _lotpolishairlines: ImageVector? = null
