package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineTo(4.664f, 4.664f)
                moveTo(21.0f, 21.0f)
                lineTo(19.5f, 19.5f)
                moveTo(14.015f, 18.258f)
                lineTo(12.0f, 17.25f)
                lineTo(4.5f, 21.0f)
                verticalLineTo(8.742f)
                moveTo(4.664f, 4.664f)
                curveTo(4.953f, 3.95f, 5.601f, 3.416f, 6.407f, 3.322f)
                curveTo(8.242f, 3.109f, 10.108f, 3.0f, 12.0f, 3.0f)
                curveTo(13.892f, 3.0f, 15.758f, 3.109f, 17.593f, 3.322f)
                curveTo(18.694f, 3.45f, 19.5f, 4.399f, 19.5f, 5.507f)
                verticalLineTo(19.5f)
                moveTo(4.664f, 4.664f)
                lineTo(19.5f, 19.5f)
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
