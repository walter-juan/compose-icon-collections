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

public val Simpleicons.Axios: ImageVector
    get() {
        if (_axios != null) {
            return _axios!!
        }
        _axios = Builder(name = "Axios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.068f, 2.9f)
                verticalLineTo(22.297f)
                lineToRelative(-2.114f, 1.703f)
                verticalLineTo(7.864f)
                horizontalLineTo(4.975f)
                lineToRelative(6.093f, -4.964f)
                close()
                moveTo(14.934f, 0.0f)
                verticalLineToRelative(15.767f)
                horizontalLineTo(19.025f)
                lineToRelative(-6.2f, 5.089f)
                verticalLineTo(1.469f)
                lineTo(14.934f, 0.0f)
                close()
            }
        }
        .build()
        return _axios!!
    }

private var _axios: ImageVector? = null
