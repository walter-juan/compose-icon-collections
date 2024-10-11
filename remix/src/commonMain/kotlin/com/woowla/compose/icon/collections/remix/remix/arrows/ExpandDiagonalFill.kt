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

public val ArrowsGroup.ExpandDiagonalFill: ImageVector
    get() {
        if (_expandDiagonalFill != null) {
            return _expandDiagonalFill!!
        }
        _expandDiagonalFill = Builder(name = "ExpandDiagonalFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(13.5f)
                lineTo(16.543f, 6.043f)
                lineTo(13.293f, 9.293f)
                lineTo(14.707f, 10.707f)
                lineTo(17.957f, 7.457f)
                lineTo(21.0f, 10.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineTo(10.5f)
                lineTo(7.457f, 17.957f)
                lineTo(10.707f, 14.707f)
                lineTo(9.293f, 13.293f)
                lineTo(6.043f, 16.543f)
                lineTo(3.0f, 13.5f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _expandDiagonalFill!!
    }

private var _expandDiagonalFill: ImageVector? = null
