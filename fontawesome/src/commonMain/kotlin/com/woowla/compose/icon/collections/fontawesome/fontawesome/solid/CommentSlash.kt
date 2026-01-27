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

public val SolidGroup.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -25.0f)
                curveTo(31.6f, -34.3f, 16.4f, -34.3f, 7.0f, -25.0f)
                reflectiveCurveTo(-2.3f, -0.4f, 7.0f, 9.0f)
                lineTo(535.0f, 537.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-96.6f, -96.6f)
                curveToRelative(44.4f, -43.2f, 71.6f, -101.8f, 71.6f, -166.5f)
                curveToRelative(0.0f, -132.5f, -114.6f, -240.0f, -256.0f, -240.0f)
                curveToRelative(-63.0f, 0.0f, -120.8f, 21.4f, -165.4f, 56.8f)
                lineTo(41.0f, -25.0f)
                close()
                moveTo(60.4f, 130.0f)
                curveTo(42.2f, 163.0f, 32.0f, 200.3f, 32.0f, 239.9f)
                curveTo(32.0f, 294.2f, 51.2f, 344.2f, 83.6f, 384.4f)
                lineTo(34.8f, 476.7f)
                curveToRelative(-4.8f, 9.0f, -3.3f, 20.0f, 3.6f, 27.5f)
                reflectiveCurveTo(56.1f, 514.0f, 65.5f, 510.0f)
                lineToRelative(118.4f, -50.7f)
                curveToRelative(31.8f, 13.3f, 67.1f, 20.7f, 104.1f, 20.7f)
                curveToRelative(36.4f, 0.0f, 70.9f, -7.1f, 102.3f, -19.9f)
                lineTo(60.3f, 130.1f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
