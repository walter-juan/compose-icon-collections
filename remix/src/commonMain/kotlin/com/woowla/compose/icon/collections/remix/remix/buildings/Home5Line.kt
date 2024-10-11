package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.Home5Line: ImageVector
    get() {
        if (_home5Line != null) {
            return _home5Line!!
        }
        _home5Line = Builder(name = "Home5Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.978f)
                lineTo(12.0f, 4.534f)
                lineTo(5.0f, 9.978f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(9.489f)
                curveTo(3.0f, 9.18f, 3.142f, 8.889f, 3.386f, 8.7f)
                lineTo(11.386f, 2.477f)
                curveTo(11.747f, 2.197f, 12.253f, 2.197f, 12.614f, 2.477f)
                lineTo(20.614f, 8.7f)
                curveTo(20.858f, 8.889f, 21.0f, 9.18f, 21.0f, 9.489f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _home5Line!!
    }

private var _home5Line: ImageVector? = null
