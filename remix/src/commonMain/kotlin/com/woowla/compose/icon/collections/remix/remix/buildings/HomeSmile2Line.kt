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

public val BuildingsGroup.HomeSmile2Line: ImageVector
    get() {
        if (_homeSmile2Line != null) {
            return _homeSmile2Line!!
        }
        _homeSmile2Line = Builder(name = "HomeSmile2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                verticalLineTo(9.799f)
                lineTo(12.0f, 4.277f)
                lineTo(5.0f, 9.799f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(9.314f)
                curveTo(3.0f, 9.008f, 3.14f, 8.718f, 3.381f, 8.529f)
                lineTo(11.381f, 2.218f)
                curveTo(11.744f, 1.931f, 12.256f, 1.931f, 12.619f, 2.218f)
                lineTo(20.619f, 8.529f)
                curveTo(20.86f, 8.718f, 21.0f, 9.008f, 21.0f, 9.314f)
                verticalLineTo(20.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _homeSmile2Line!!
    }

private var _homeSmile2Line: ImageVector? = null
