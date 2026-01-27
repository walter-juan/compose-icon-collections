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

public val BrandsGroup.Unsplash: ImageVector
    get() {
        if (_unsplash != null) {
            return _unsplash!!
        }
        _unsplash = Builder(name = "Unsplash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 230.2f)
                lineToRelative(0.0f, 249.8f)
                lineToRelative(-448.0f, 0.0f)
                lineToRelative(0.0f, -249.8f)
                lineToRelative(141.1f, 0.0f)
                lineToRelative(0.0f, 124.9f)
                lineToRelative(165.7f, 0.0f)
                lineToRelative(0.0f, -124.9f)
                lineToRelative(141.1f, 0.0f)
                close()
                moveTo(306.9f, 32.0f)
                lineToRelative(-165.7f, 0.0f)
                lineToRelative(0.0f, 124.9f)
                lineToRelative(165.7f, 0.0f)
                lineToRelative(0.0f, -124.9f)
                close()
            }
        }
        .build()
        return _unsplash!!
    }

private var _unsplash: ImageVector? = null
