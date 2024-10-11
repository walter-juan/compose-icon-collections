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

public val BuildingsGroup.Home6Fill: ImageVector
    get() {
        if (_home6Fill != null) {
            return _home6Fill!!
        }
        _home6Fill = Builder(name = "Home6Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(7.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _home6Fill!!
    }

private var _home6Fill: ImageVector? = null
