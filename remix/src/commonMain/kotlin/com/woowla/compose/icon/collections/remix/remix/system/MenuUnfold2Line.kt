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

public val SystemGroup.MenuUnfold2Line: ImageVector
    get() {
        if (_menuUnfold2Line != null) {
            return _menuUnfold2Line!!
        }
        _menuUnfold2Line = Builder(name = "MenuUnfold2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.596f, 3.903f)
                lineTo(15.999f, 8.5f)
                lineTo(20.596f, 13.096f)
                lineTo(22.01f, 11.682f)
                lineTo(18.828f, 8.5f)
                lineTo(22.01f, 5.318f)
                lineTo(20.596f, 3.903f)
                close()
                moveTo(21.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _menuUnfold2Line!!
    }

private var _menuUnfold2Line: ImageVector? = null
