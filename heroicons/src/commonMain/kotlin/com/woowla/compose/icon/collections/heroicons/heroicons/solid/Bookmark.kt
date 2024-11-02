package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.32f, 2.577f)
                curveTo(8.184f, 2.361f, 10.079f, 2.25f, 12.0f, 2.25f)
                curveTo(13.921f, 2.25f, 15.816f, 2.361f, 17.68f, 2.577f)
                curveTo(19.177f, 2.751f, 20.25f, 4.037f, 20.25f, 5.507f)
                verticalLineTo(21.0f)
                curveTo(20.25f, 21.26f, 20.115f, 21.501f, 19.894f, 21.638f)
                curveTo(19.673f, 21.775f, 19.397f, 21.787f, 19.165f, 21.671f)
                lineTo(12.0f, 18.088f)
                lineTo(4.835f, 21.671f)
                curveTo(4.603f, 21.787f, 4.327f, 21.775f, 4.106f, 21.638f)
                curveTo(3.885f, 21.501f, 3.75f, 21.26f, 3.75f, 21.0f)
                verticalLineTo(5.507f)
                curveTo(3.75f, 4.037f, 4.823f, 2.751f, 6.32f, 2.577f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
