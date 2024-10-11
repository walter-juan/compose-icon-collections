package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.DoorLockFill: ImageVector
    get() {
        if (_doorLockFill != null) {
            return _doorLockFill!!
        }
        _doorLockFill = Builder(name = "DoorLockFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 12.792f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.792f)
                curveTo(13.883f, 12.406f, 14.5f, 11.525f, 14.5f, 10.5f)
                curveTo(14.5f, 9.119f, 13.381f, 8.0f, 12.0f, 8.0f)
                curveTo(10.619f, 8.0f, 9.5f, 9.119f, 9.5f, 10.5f)
                curveTo(9.5f, 11.525f, 10.117f, 12.406f, 11.0f, 12.792f)
                close()
            }
        }
        .build()
        return _doorLockFill!!
    }

private var _doorLockFill: ImageVector? = null
