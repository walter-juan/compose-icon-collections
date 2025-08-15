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

public val SolidGroup.ThumbTackSlash: ImageVector
    get() {
        if (_thumbTackSlash != null) {
            return _thumbTackSlash!!
        }
        _thumbTackSlash = Builder(name = "ThumbTackSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(417.8f, 352.0f)
                lineTo(448.0f, 352.0f)
                curveToRelative(10.0f, 0.0f, 19.5f, -4.7f, 25.5f, -12.7f)
                reflectiveCurveToRelative(8.0f, -18.4f, 5.2f, -28.1f)
                lineTo(475.0f, 297.8f)
                curveToRelative(-12.4f, -43.3f, -41.0f, -78.5f, -78.2f, -99.7f)
                lineTo(386.5f, 64.0f)
                lineTo(416.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveTo(433.7f, 0.0f, 416.0f, 0.0f)
                lineTo(160.0f, 0.0f)
                curveToRelative(-7.4f, 0.0f, -14.1f, 2.5f, -19.5f, 6.6f)
                lineTo(190.1f, 56.3f)
                lineTo(185.3f, 119.4f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(282.2f, 352.0f)
                lineTo(149.7f, 219.6f)
                curveToRelative(-22.7f, 20.5f, -39.8f, 47.4f, -48.7f, 78.3f)
                lineToRelative(-3.8f, 13.4f)
                curveToRelative(-2.8f, 9.7f, -0.8f, 20.0f, 5.2f, 28.1f)
                reflectiveCurveTo(118.0f, 352.0f, 128.0f, 352.0f)
                lineToRelative(154.2f, 0.0f)
                close()
                moveTo(256.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _thumbTackSlash!!
    }

private var _thumbTackSlash: ImageVector? = null
