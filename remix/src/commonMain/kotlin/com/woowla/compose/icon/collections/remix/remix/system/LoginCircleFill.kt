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

public val SystemGroup.LoginCircleFill: ImageVector
    get() {
        if (_loginCircleFill != null) {
            return _loginCircleFill!!
        }
        _loginCircleFill = Builder(name = "LoginCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.999f, 11.0f)
                horizontalLineTo(2.049f)
                curveTo(2.551f, 5.947f, 6.814f, 2.0f, 12.0f, 2.0f)
                curveTo(17.522f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.522f, 22.0f, 12.0f, 22.0f)
                curveTo(6.814f, 22.0f, 2.551f, 18.053f, 2.049f, 13.0f)
                horizontalLineTo(9.999f)
                verticalLineTo(16.0f)
                lineTo(15.0f, 12.0f)
                lineTo(9.999f, 8.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _loginCircleFill!!
    }

private var _loginCircleFill: ImageVector? = null
