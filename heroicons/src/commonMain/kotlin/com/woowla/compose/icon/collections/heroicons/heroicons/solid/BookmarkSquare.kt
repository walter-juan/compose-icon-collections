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

public val SolidGroup.BookmarkSquare: ImageVector
    get() {
        if (_bookmarkSquare != null) {
            return _bookmarkSquare!!
        }
        _bookmarkSquare = Builder(name = "BookmarkSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.657f, 4.343f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 21.0f, 21.0f, 19.657f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.343f, 19.657f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(7.5f, 4.5f)
                curveTo(7.086f, 4.5f, 6.75f, 4.836f, 6.75f, 5.25f)
                verticalLineTo(16.5f)
                curveTo(6.75f, 16.76f, 6.885f, 17.001f, 7.106f, 17.138f)
                curveTo(7.327f, 17.275f, 7.603f, 17.287f, 7.835f, 17.171f)
                lineTo(12.0f, 15.089f)
                lineTo(16.165f, 17.171f)
                curveTo(16.397f, 17.287f, 16.673f, 17.275f, 16.894f, 17.138f)
                curveTo(17.115f, 17.001f, 17.25f, 16.76f, 17.25f, 16.5f)
                verticalLineTo(5.25f)
                curveTo(17.25f, 4.836f, 16.914f, 4.5f, 16.5f, 4.5f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _bookmarkSquare!!
    }

private var _bookmarkSquare: ImageVector? = null
