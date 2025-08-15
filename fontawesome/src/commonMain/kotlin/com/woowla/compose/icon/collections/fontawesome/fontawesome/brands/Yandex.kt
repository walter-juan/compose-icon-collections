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

public val BrandsGroup.Yandex: ImageVector
    get() {
        if (_yandex != null) {
            return _yandex!!
        }
        _yandex = Builder(name = "Yandex", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.1f, 315.8f)
                lineTo(65.7f, 512.0f)
                lineTo(2.0f, 512.0f)
                lineTo(98.0f, 302.2f)
                curveTo(52.9f, 279.3f, 22.8f, 237.8f, 22.8f, 161.1f)
                curveTo(22.7f, 53.7f, 90.8f, 0.0f, 171.7f, 0.0f)
                lineToRelative(82.3f, 0.0f)
                lineToRelative(0.0f, 512.0f)
                lineToRelative(-55.1f, 0.0f)
                lineToRelative(0.0f, -196.2f)
                lineToRelative(-45.8f, 0.0f)
                close()
                moveTo(198.9f, 46.5f)
                lineToRelative(-29.4f, 0.0f)
                curveToRelative(-44.4f, 0.0f, -87.4f, 29.4f, -87.4f, 114.6f)
                curveToRelative(0.0f, 82.3f, 39.4f, 108.8f, 87.4f, 108.8f)
                lineToRelative(29.4f, 0.0f)
                lineToRelative(0.0f, -223.4f)
                close()
            }
        }
        .build()
        return _yandex!!
    }

private var _yandex: ImageVector? = null
