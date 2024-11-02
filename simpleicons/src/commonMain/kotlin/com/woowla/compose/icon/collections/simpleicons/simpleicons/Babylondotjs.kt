package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Babylondotjs: ImageVector
    get() {
        if (_babylondotjs != null) {
            return _babylondotjs!!
        }
        _babylondotjs = Builder(name = "Babylondotjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.607f, 6.002f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.393f, -6.0f)
                lineTo(22.393f, 6.0f)
                lineTo(19.14f, 4.123f)
                lineTo(16.01f, 5.93f)
                lineToRelative(3.252f, 1.879f)
                verticalLineToRelative(8.384f)
                lineTo(12.0f, 20.387f)
                lineToRelative(-7.264f, -4.194f)
                lineTo(4.736f, 7.807f)
                lineToRelative(10.393f, -6.0f)
                close()
                moveTo(12.0f, 8.244f)
                lineTo(8.746f, 10.123f)
                verticalLineToRelative(3.754f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(0.004f)
                lineTo(12.0f, 15.758f)
                lineToRelative(3.252f, -1.877f)
                verticalLineToRelative(-3.76f)
                close()
            }
        }
        .build()
        return _babylondotjs!!
    }

private var _babylondotjs: ImageVector? = null
