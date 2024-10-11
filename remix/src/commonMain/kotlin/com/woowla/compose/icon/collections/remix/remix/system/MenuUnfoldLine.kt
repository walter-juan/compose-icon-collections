package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.MenuUnfoldLine: ImageVector
    get() {
        if (_menuUnfoldLine != null) {
            return _menuUnfoldLine!!
        }
        _menuUnfoldLine = Builder(name = "MenuUnfoldLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.404f, 3.903f)
                lineTo(22.0f, 8.5f)
                lineTo(17.404f, 13.096f)
                lineTo(15.99f, 11.682f)
                lineTo(19.172f, 8.5f)
                lineTo(15.99f, 5.318f)
                lineTo(17.404f, 3.903f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _menuUnfoldLine!!
    }

private var _menuUnfoldLine: ImageVector? = null
