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

public val RegularGroup.FontAwesomeBrand: ImageVector
    get() {
        if (_fontAwesomeBrand != null) {
            return _fontAwesomeBrand!!
        }
        _fontAwesomeBrand = Builder(name = "FontAwesomeBrand", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.7f, 96.0f)
                curveTo(106.3f, 86.8f, 116.0f, 70.5f, 116.0f, 52.0f)
                curveTo(116.0f, 23.3f, 92.7f, 0.0f, 64.0f, 0.0f)
                reflectiveCurveTo(12.0f, 23.3f, 12.0f, 52.0f)
                curveToRelative(0.0f, 16.7f, 7.8f, 31.5f, 20.0f, 41.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(0.0f, 256.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(389.6f, 0.0f)
                curveToRelative(14.6f, 0.0f, 26.4f, -11.8f, 26.4f, -26.4f)
                curveToRelative(0.0f, -3.7f, -0.8f, -7.3f, -2.3f, -10.7f)
                lineTo(432.0f, 272.0f)
                lineToRelative(61.7f, -138.9f)
                curveToRelative(1.5f, -3.4f, 2.3f, -7.0f, 2.3f, -10.7f)
                curveToRelative(0.0f, -14.6f, -11.8f, -26.4f, -26.4f, -26.4f)
                lineTo(91.7f, 96.0f)
                close()
                moveTo(80.0f, 400.0f)
                lineToRelative(0.0f, -256.0f)
                lineToRelative(356.4f, 0.0f)
                lineTo(388.1f, 252.5f)
                curveToRelative(-5.5f, 12.4f, -5.5f, 26.6f, 0.0f, 39.0f)
                lineTo(436.4f, 400.0f)
                lineTo(80.0f, 400.0f)
                close()
            }
        }
        .build()
        return _fontAwesomeBrand!!
    }

private var _fontAwesomeBrand: ImageVector? = null
