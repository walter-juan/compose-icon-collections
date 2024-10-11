package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.Steering2Line: ImageVector
    get() {
        if (_steering2Line != null) {
            return _steering2Line!!
        }
        _steering2Line = Builder(name = "Steering2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(4.062f, 13.001f)
                curveTo(4.514f, 16.619f, 7.382f, 19.487f, 11.0f, 19.938f)
                verticalLineTo(16.0f)
                curveTo(9.343f, 16.0f, 8.0f, 14.657f, 8.0f, 13.0f)
                close()
                moveTo(19.938f, 13.001f)
                lineTo(16.0f, 13.0f)
                curveTo(16.0f, 14.657f, 14.657f, 16.0f, 13.0f, 16.0f)
                lineTo(13.001f, 19.938f)
                curveTo(16.619f, 19.486f, 19.486f, 16.619f, 19.938f, 13.001f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 13.552f, 10.448f, 14.0f, 11.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 14.0f, 14.0f, 13.552f, 14.0f, 13.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.92f, 4.0f, 4.554f, 7.054f, 4.062f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 10.448f, 8.448f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 10.0f, 16.0f, 10.448f, 16.0f, 11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.446f, 7.054f, 16.08f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _steering2Line!!
    }

private var _steering2Line: ImageVector? = null
