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

public val ArrowsGroup.ExpandDiagonal2Line: ImageVector
    get() {
        if (_expandDiagonal2Line != null) {
            return _expandDiagonal2Line!!
        }
        _expandDiagonal2Line = Builder(name = "ExpandDiagonal2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.414f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.414f)
                lineTo(9.293f, 10.707f)
                lineTo(10.707f, 9.293f)
                lineTo(6.414f, 5.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.586f)
                lineTo(14.707f, 13.293f)
                lineTo(13.293f, 14.707f)
                lineTo(17.586f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _expandDiagonal2Line!!
    }

private var _expandDiagonal2Line: ImageVector? = null
