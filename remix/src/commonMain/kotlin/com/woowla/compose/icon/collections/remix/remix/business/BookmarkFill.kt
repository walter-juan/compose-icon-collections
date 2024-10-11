package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.BookmarkFill: ImageVector
    get() {
        if (_bookmarkFill != null) {
            return _bookmarkFill!!
        }
        _bookmarkFill = Builder(name = "BookmarkFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 2.0f, 20.0f, 2.448f, 20.0f, 3.0f)
                verticalLineTo(22.143f)
                curveTo(20.0f, 22.419f, 19.776f, 22.643f, 19.5f, 22.643f)
                curveTo(19.406f, 22.643f, 19.314f, 22.617f, 19.234f, 22.567f)
                lineTo(12.0f, 18.031f)
                lineTo(4.766f, 22.567f)
                curveTo(4.532f, 22.714f, 4.223f, 22.643f, 4.076f, 22.409f)
                curveTo(4.026f, 22.329f, 4.0f, 22.237f, 4.0f, 22.143f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.448f, 4.448f, 2.0f, 5.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bookmarkFill!!
    }

private var _bookmarkFill: ImageVector? = null
