package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.CollapseDiagonalFill: ImageVector
    get() {
        if (_collapseDiagonalFill != null) {
            return _collapseDiagonalFill!!
        }
        _collapseDiagonalFill = Builder(name = "CollapseDiagonalFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                lineTo(16.043f, 6.543f)
                lineTo(19.293f, 3.293f)
                lineTo(20.707f, 4.707f)
                lineTo(17.457f, 7.957f)
                lineTo(20.5f, 11.0f)
                close()
                moveTo(3.5f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.5f)
                lineTo(7.957f, 17.457f)
                lineTo(4.707f, 20.707f)
                lineTo(3.293f, 19.293f)
                lineTo(6.543f, 16.043f)
                lineTo(3.5f, 13.0f)
                close()
            }
        }
        .build()
        return _collapseDiagonalFill!!
    }

private var _collapseDiagonalFill: ImageVector? = null
