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

public val Simpleicons.Typer: ImageVector
    get() {
        if (_typer != null) {
            return _typer!!
        }
        _typer = Builder(name = "Typer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.818f, 3.646f)
                lineTo(2.182f, 3.646f)
                curveTo(0.982f, 3.646f, 0.0f, 4.483f, 0.0f, 5.505f)
                verticalLineToRelative(3.707f)
                horizontalLineToRelative(2.182f)
                lineTo(2.182f, 5.486f)
                horizontalLineToRelative(19.636f)
                verticalLineToRelative(13.036f)
                lineTo(2.182f, 18.522f)
                verticalLineToRelative(-3.735f)
                lineTo(0.0f, 14.787f)
                verticalLineToRelative(3.726f)
                curveToRelative(0.0f, 1.022f, 0.982f, 1.84f, 2.182f, 1.84f)
                horizontalLineToRelative(19.636f)
                curveToRelative(1.2f, 0.0f, 2.182f, -0.818f, 2.182f, -1.84f)
                lineTo(24.0f, 5.505f)
                curveToRelative(0.0f, -1.032f, -0.982f, -1.859f, -2.182f, -1.859f)
                close()
                moveTo(10.909f, 15.716f)
                lineTo(15.273f, 12.0f)
                lineToRelative(-4.364f, -3.717f)
                verticalLineToRelative(2.787f)
                lineTo(0.0f, 11.07f)
                verticalLineToRelative(1.859f)
                horizontalLineToRelative(10.909f)
                verticalLineToRelative(2.787f)
                close()
            }
        }
        .build()
        return _typer!!
    }

private var _typer: ImageVector? = null
