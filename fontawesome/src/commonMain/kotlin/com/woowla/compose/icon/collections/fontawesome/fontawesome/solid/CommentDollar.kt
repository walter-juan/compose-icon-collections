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

public val SolidGroup.CommentDollar: ImageVector
    get() {
        if (_commentDollar != null) {
            return _commentDollar!!
        }
        _commentDollar = Builder(name = "CommentDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -107.5f, 256.0f, -240.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 107.5f, 0.0f, 240.0f)
                curveToRelative(0.0f, 54.3f, 19.2f, 104.3f, 51.6f, 144.5f)
                lineTo(2.8f, 476.8f)
                curveToRelative(-4.8f, 9.0f, -3.3f, 20.0f, 3.6f, 27.5f)
                reflectiveCurveToRelative(17.8f, 9.8f, 27.1f, 5.8f)
                lineToRelative(118.4f, -50.7f)
                curveTo(183.7f, 472.6f, 218.9f, 480.0f, 256.0f, 480.0f)
                close()
                moveTo(260.0f, 128.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 9.0f, 20.0f, 20.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, 9.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(-9.0f, 20.0f, -20.0f, 20.0f)
                lineToRelative(-47.5f, 0.0f)
                curveToRelative(-6.9f, 0.0f, -12.5f, 5.6f, -12.5f, 12.5f)
                curveToRelative(0.0f, 6.1f, 4.4f, 11.3f, 10.4f, 12.3f)
                lineToRelative(41.7f, 7.0f)
                curveToRelative(25.3f, 4.2f, 43.9f, 26.1f, 43.9f, 51.8f)
                curveToRelative(0.0f, 26.1f, -19.0f, 47.7f, -44.0f, 51.8f)
                lineToRelative(0.0f, 4.7f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -9.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(9.0f, -20.0f, 20.0f, -20.0f)
                lineToRelative(55.5f, 0.0f)
                curveToRelative(6.9f, 0.0f, 12.5f, -5.6f, 12.5f, -12.5f)
                curveToRelative(0.0f, -6.1f, -4.4f, -11.3f, -10.4f, -12.3f)
                lineToRelative(-41.7f, -7.0f)
                curveToRelative(-25.3f, -4.2f, -43.9f, -26.1f, -43.9f, -51.8f)
                curveToRelative(0.0f, -28.8f, 23.2f, -52.2f, 52.0f, -52.5f)
                lineToRelative(0.0f, -4.0f)
                curveToRelative(0.0f, -11.0f, 9.0f, -20.0f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _commentDollar!!
    }

private var _commentDollar: ImageVector? = null
