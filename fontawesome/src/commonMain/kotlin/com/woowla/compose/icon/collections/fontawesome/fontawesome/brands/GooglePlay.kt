package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(293.6f, 234.3f)
                lineTo(72.9f, 13.0f)
                lineTo(353.7f, 174.2f)
                lineTo(293.6f, 234.3f)
                close()
                moveTo(15.3f, 0.0f)
                curveTo(2.3f, 6.8f, -6.4f, 19.2f, -6.4f, 35.3f)
                lineToRelative(0.0f, 441.3f)
                curveToRelative(0.0f, 16.1f, 8.7f, 28.5f, 21.7f, 35.3f)
                lineTo(271.9f, 255.9f)
                lineTo(15.3f, 0.0f)
                close()
                moveTo(440.5f, 225.6f)
                lineToRelative(-58.9f, -34.1f)
                lineToRelative(-65.7f, 64.5f)
                lineToRelative(65.7f, 64.5f)
                lineToRelative(60.1f, -34.1f)
                curveToRelative(18.0f, -14.3f, 18.0f, -46.5f, -1.2f, -60.8f)
                close()
                moveTo(72.9f, 499.0f)
                lineTo(353.7f, 337.8f)
                lineTo(293.6f, 277.7f)
                lineTo(72.9f, 499.0f)
                close()
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
