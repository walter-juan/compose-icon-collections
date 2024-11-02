package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.53f, 2.47f)
                curveTo(3.237f, 2.177f, 2.763f, 2.177f, 2.47f, 2.47f)
                curveTo(2.177f, 2.763f, 2.177f, 3.237f, 2.47f, 3.53f)
                lineTo(20.47f, 21.53f)
                curveTo(20.763f, 21.823f, 21.237f, 21.823f, 21.53f, 21.53f)
                curveTo(21.823f, 21.237f, 21.823f, 20.763f, 21.53f, 20.47f)
                lineTo(3.53f, 2.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 5.507f)
                verticalLineTo(17.068f)
                lineTo(5.853f, 2.671f)
                curveTo(6.003f, 2.628f, 6.159f, 2.596f, 6.32f, 2.577f)
                curveTo(8.184f, 2.361f, 10.079f, 2.25f, 12.0f, 2.25f)
                curveTo(13.921f, 2.25f, 15.816f, 2.361f, 17.68f, 2.577f)
                curveTo(19.177f, 2.751f, 20.25f, 4.037f, 20.25f, 5.507f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 21.0f)
                verticalLineTo(6.932f)
                lineTo(17.813f, 20.995f)
                lineTo(12.0f, 18.088f)
                lineTo(4.835f, 21.671f)
                curveTo(4.603f, 21.787f, 4.327f, 21.775f, 4.106f, 21.638f)
                curveTo(3.885f, 21.501f, 3.75f, 21.26f, 3.75f, 21.0f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
