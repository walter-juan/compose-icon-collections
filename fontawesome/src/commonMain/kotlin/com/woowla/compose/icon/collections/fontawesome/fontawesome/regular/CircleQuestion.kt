package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.CircleQuestion: ImageVector
    get() {
        if (_circleQuestion != null) {
            return _circleQuestion!!
        }
        _circleQuestion = Builder(name = "CircleQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                arcTo(208.0f, 208.0f, 0.0f, true, false, 48.0f, 256.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, false, 416.0f, 0.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(169.8f, 165.3f)
                curveToRelative(7.9f, -22.3f, 29.1f, -37.3f, 52.8f, -37.3f)
                lineToRelative(58.3f, 0.0f)
                curveToRelative(34.9f, 0.0f, 63.1f, 28.3f, 63.1f, 63.1f)
                curveToRelative(0.0f, 22.6f, -12.1f, 43.5f, -31.7f, 54.8f)
                lineTo(280.0f, 264.4f)
                curveToRelative(-0.2f, 13.0f, -10.9f, 23.6f, -24.0f, 23.6f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -13.5f)
                curveToRelative(0.0f, -8.6f, 4.6f, -16.5f, 12.1f, -20.8f)
                lineToRelative(44.3f, -25.4f)
                curveToRelative(4.7f, -2.7f, 7.6f, -7.7f, 7.6f, -13.1f)
                curveToRelative(0.0f, -8.4f, -6.8f, -15.1f, -15.1f, -15.1f)
                lineToRelative(-58.3f, 0.0f)
                curveToRelative(-3.4f, 0.0f, -6.4f, 2.1f, -7.5f, 5.3f)
                lineToRelative(-0.4f, 1.2f)
                curveToRelative(-4.4f, 12.5f, -18.2f, 19.0f, -30.6f, 14.6f)
                reflectiveCurveToRelative(-19.0f, -18.2f, -14.6f, -30.6f)
                lineToRelative(0.4f, -1.2f)
                close()
                moveTo(224.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _circleQuestion!!
    }

private var _circleQuestion: ImageVector? = null
