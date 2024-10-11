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

public val ArrowsGroup.CollapseDiagonalLine: ImageVector
    get() {
        if (_collapseDiagonalLine != null) {
            return _collapseDiagonalLine!!
        }
        _collapseDiagonalLine = Builder(name = "CollapseDiagonalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.414f)
                lineTo(20.707f, 4.707f)
                lineTo(19.293f, 3.293f)
                lineTo(15.0f, 7.586f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineTo(7.586f)
                lineTo(3.293f, 19.293f)
                lineTo(4.707f, 20.707f)
                lineTo(9.0f, 16.414f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _collapseDiagonalLine!!
    }

private var _collapseDiagonalLine: ImageVector? = null
