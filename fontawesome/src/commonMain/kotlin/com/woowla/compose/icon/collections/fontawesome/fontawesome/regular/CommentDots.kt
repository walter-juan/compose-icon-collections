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

public val RegularGroup.CommentDots: ImageVector
    get() {
        if (_commentDots != null) {
            return _commentDots!!
        }
        _commentDots = Builder(name = "CommentDots", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 240.0f)
                curveToRelative(0.0f, 54.4f, 19.3f, 104.6f, 51.9f, 144.9f)
                lineTo(3.1f, 474.3f)
                curveToRelative(-2.0f, 3.7f, -3.1f, 7.9f, -3.1f, 12.2f)
                curveToRelative(0.0f, 14.1f, 11.4f, 25.5f, 25.5f, 25.5f)
                curveToRelative(4.0f, 0.0f, 7.8f, -0.6f, 11.5f, -2.1f)
                lineTo(153.4f, 460.0f)
                curveToRelative(31.4f, 12.9f, 66.1f, 20.0f, 102.6f, 20.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -107.5f, 256.0f, -240.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 107.5f, 0.0f, 240.0f)
                close()
                moveTo(94.0f, 407.9f)
                curveToRelative(9.3f, -17.1f, 7.4f, -38.1f, -4.8f, -53.2f)
                curveToRelative(-26.1f, -32.3f, -41.2f, -71.9f, -41.2f, -114.7f)
                curveToRelative(0.0f, -103.2f, 90.2f, -192.0f, 208.0f, -192.0f)
                reflectiveCurveToRelative(208.0f, 88.8f, 208.0f, 192.0f)
                reflectiveCurveToRelative(-90.2f, 192.0f, -208.0f, 192.0f)
                curveToRelative(-30.2f, 0.0f, -58.7f, -5.9f, -84.3f, -16.4f)
                curveToRelative(-11.9f, -4.9f, -25.3f, -4.8f, -37.1f, 0.3f)
                lineTo(76.0f, 440.9f)
                lineTo(94.0f, 407.9f)
                close()
                moveTo(144.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(288.0f, 240.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(368.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
