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

public val Simpleicons.Infomaniak: ImageVector
    get() {
        if (_infomaniak != null) {
            return _infomaniak!!
        }
        _infomaniak = Builder(name = "Infomaniak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4f, 0.0f)
                arcTo(2.395f, 2.395f, 0.0f, false, false, 0.0f, 2.4f)
                verticalLineToRelative(19.2f)
                curveTo(0.0f, 22.93f, 1.07f, 24.0f, 2.4f, 24.0f)
                horizontalLineToRelative(19.2f)
                curveToRelative(1.33f, 0.0f, 2.4f, -1.07f, 2.4f, -2.4f)
                verticalLineTo(2.4f)
                curveTo(24.0f, 1.07f, 22.93f, 0.0f, 21.6f, 0.0f)
                horizontalLineTo(10.112f)
                verticalLineToRelative(11.712f)
                lineToRelative(3.648f, -4.128f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-4.58f, 4.351f)
                lineToRelative(4.868f, 8.13f)
                horizontalLineToRelative(-5.52f)
                lineToRelative(-2.594f, -5.021f)
                lineTo(10.112f, 16.8f)
                verticalLineToRelative(3.264f)
                horizontalLineTo(5.12f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _infomaniak!!
    }

private var _infomaniak: ImageVector? = null
