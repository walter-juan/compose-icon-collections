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

public val BrandsGroup.Adn: ImageVector
    get() {
        if (_adn != null) {
            return _adn!!
        }
        _adn = Builder(name = "Adn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 167.5f)
                lineToRelative(64.9f, 98.8f)
                lineToRelative(-129.8f, 0.0f)
                lineToRelative(64.9f, -98.8f)
                close()
                moveTo(8.0f, 256.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, true, 496.0f, 0.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, true, -496.0f, 0.0f)
                close()
                moveTo(404.2f, 338.7f)
                lineToRelative(-148.2f, -223.2f)
                lineToRelative(-148.2f, 223.2f)
                lineToRelative(30.4f, 0.0f)
                lineToRelative(33.6f, -51.7f)
                lineToRelative(168.6f, 0.0f)
                lineToRelative(33.6f, 51.7f)
                lineToRelative(30.2f, 0.0f)
                close()
            }
        }
        .build()
        return _adn!!
    }

private var _adn: ImageVector? = null
