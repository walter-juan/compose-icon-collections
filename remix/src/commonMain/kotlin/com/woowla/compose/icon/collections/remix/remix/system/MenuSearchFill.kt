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

public val SystemGroup.MenuSearchFill: ImageVector
    get() {
        if (_menuSearchFill != null) {
            return _menuSearchFill!!
        }
        _menuSearchFill = Builder(name = "MenuSearchFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.618f, 13.032f)
                curveTo(17.732f, 13.642f, 16.657f, 14.0f, 15.5f, 14.0f)
                curveTo(12.462f, 14.0f, 10.0f, 11.538f, 10.0f, 8.5f)
                curveTo(10.0f, 5.462f, 12.462f, 3.0f, 15.5f, 3.0f)
                curveTo(18.538f, 3.0f, 21.0f, 5.462f, 21.0f, 8.5f)
                curveTo(21.0f, 9.658f, 20.642f, 10.731f, 20.032f, 11.618f)
                lineTo(22.707f, 14.293f)
                lineTo(21.293f, 15.707f)
                lineTo(18.618f, 13.032f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _menuSearchFill!!
    }

private var _menuSearchFill: ImageVector? = null
