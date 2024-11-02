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

public val Simpleicons.Revolut: ImageVector
    get() {
        if (_revolut != null) {
            return _revolut!!
        }
        _revolut = Builder(name = "Revolut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.913f, 6.957f)
                curveTo(20.913f, 3.121f, 17.79f, 0.0f, 13.95f, 0.0f)
                horizontalLineTo(2.424f)
                verticalLineToRelative(3.861f)
                horizontalLineToRelative(10.978f)
                curveToRelative(1.738f, 0.0f, 3.177f, 1.365f, 3.209f, 3.043f)
                curveToRelative(0.016f, 0.84f, -0.299f, 1.633f, -0.888f, 2.232f)
                curveToRelative(-0.589f, 0.6f, -1.375f, 0.93f, -2.214f, 0.93f)
                horizontalLineTo(9.232f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, false, -0.275f, 0.275f)
                verticalLineToRelative(3.431f)
                curveToRelative(0.0f, 0.058f, 0.018f, 0.114f, 0.052f, 0.161f)
                lineTo(16.265f, 24.0f)
                horizontalLineToRelative(5.311f)
                lineToRelative(-7.273f, -10.094f)
                curveToRelative(3.662f, -0.184f, 6.61f, -3.261f, 6.61f, -6.949f)
                close()
                moveTo(6.894f, 5.923f)
                horizontalLineTo(2.424f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.47f)
                close()
            }
        }
        .build()
        return _revolut!!
    }

private var _revolut: ImageVector? = null
