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

public val SystemGroup.LockUnlockLine: ImageVector
    get() {
        if (_lockUnlockLine != null) {
            return _lockUnlockLine!!
        }
        _lockUnlockLine = Builder(name = "LockUnlockLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 10.0f, 21.0f, 10.448f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.448f, 3.448f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(14.741f, 2.0f, 17.113f, 3.575f, 18.262f, 5.869f)
                lineTo(16.473f, 6.763f)
                curveTo(15.652f, 5.125f, 13.958f, 4.0f, 12.0f, 4.0f)
                curveTo(9.239f, 4.0f, 7.0f, 6.239f, 7.0f, 9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _lockUnlockLine!!
    }

private var _lockUnlockLine: ImageVector? = null
