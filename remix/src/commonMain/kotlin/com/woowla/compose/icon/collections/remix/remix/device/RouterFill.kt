package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.RouterFill: ImageVector
    get() {
        if (_routerFill != null) {
            return _routerFill!!
        }
        _routerFill = Builder(name = "RouterFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 14.0f, 19.0f, 14.448f, 19.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.552f, 18.552f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 14.448f, 5.448f, 14.0f, 6.0f, 14.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(2.511f, 8.837f)
                curveTo(3.834f, 4.864f, 7.583f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.166f, 4.864f, 21.49f, 8.837f)
                lineTo(19.592f, 9.469f)
                curveTo(18.533f, 6.291f, 15.534f, 4.0f, 12.0f, 4.0f)
                curveTo(8.466f, 4.0f, 5.467f, 6.291f, 4.409f, 9.469f)
                lineTo(2.511f, 8.837f)
                close()
                moveTo(6.306f, 10.102f)
                curveTo(7.101f, 7.719f, 9.35f, 6.0f, 12.0f, 6.0f)
                curveTo(14.651f, 6.0f, 16.9f, 7.719f, 17.694f, 10.102f)
                lineTo(15.796f, 10.735f)
                curveTo(15.267f, 9.146f, 13.767f, 8.0f, 12.0f, 8.0f)
                curveTo(10.233f, 8.0f, 8.734f, 9.146f, 8.204f, 10.735f)
                lineTo(6.306f, 10.102f)
                close()
            }
        }
        .build()
        return _routerFill!!
    }

private var _routerFill: ImageVector? = null
