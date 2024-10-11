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

public val ArrowsGroup.CollapseDiagonal2Line: ImageVector
    get() {
        if (_collapseDiagonal2Line != null) {
            return _collapseDiagonal2Line!!
        }
        _collapseDiagonal2Line = Builder(name = "CollapseDiagonal2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.586f)
                lineTo(3.293f, 4.707f)
                lineTo(4.707f, 3.293f)
                lineTo(9.0f, 7.586f)
                verticalLineTo(4.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineTo(16.414f)
                lineTo(20.707f, 19.293f)
                lineTo(19.293f, 20.707f)
                lineTo(15.0f, 16.414f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _collapseDiagonal2Line!!
    }

private var _collapseDiagonal2Line: ImageVector? = null
