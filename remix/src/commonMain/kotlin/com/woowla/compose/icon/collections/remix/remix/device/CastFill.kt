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

public val DeviceGroup.CastFill: ImageVector
    get() {
        if (_castFill != null) {
            return _castFill!!
        }
        _castFill = Builder(name = "CastFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 20.32f, 14.948f, 19.652f, 14.847f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.153f)
                curveTo(3.348f, 8.052f, 2.68f, 8.0f, 2.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 16.029f, 6.971f, 12.0f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(8.075f, 10.0f, 13.0f, 14.925f, 13.0f, 21.0f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 18.239f, 4.761f, 16.0f, 2.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(5.866f, 14.0f, 9.0f, 17.134f, 9.0f, 21.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(3.657f, 18.0f, 5.0f, 19.343f, 5.0f, 21.0f)
                close()
                moveTo(14.373f, 17.0f)
                curveTo(13.093f, 13.038f, 9.962f, 9.907f, 6.0f, 8.627f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.373f)
                close()
            }
        }
        .build()
        return _castFill!!
    }

private var _castFill: ImageVector? = null
