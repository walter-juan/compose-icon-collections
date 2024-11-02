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

public val Simpleicons.Astral: ImageVector
    get() {
        if (_astral != null) {
            return _astral!!
        }
        _astral = Builder(name = "Astral", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.44f, 0.0f)
                curveTo(0.642f, 0.0f, 0.0f, 0.642f, 0.0f, 1.44f)
                verticalLineToRelative(21.12f)
                curveTo(0.0f, 23.358f, 0.642f, 24.0f, 1.44f, 24.0f)
                horizontalLineToRelative(21.12f)
                curveToRelative(0.798f, 0.0f, 1.44f, -0.642f, 1.44f, -1.44f)
                lineTo(24.0f, 1.44f)
                curveTo(24.0f, 0.642f, 23.358f, 0.0f, 22.56f, 0.0f)
                close()
                moveTo(6.24f, 4.8f)
                horizontalLineToRelative(11.52f)
                curveToRelative(0.795f, 0.0f, 1.44f, 0.645f, 1.44f, 1.44f)
                lineTo(19.2f, 19.2f)
                horizontalLineToRelative(-6.624f)
                verticalLineToRelative(-4.32f)
                horizontalLineToRelative(-1.152f)
                verticalLineToRelative(4.32f)
                lineTo(4.8f, 19.2f)
                lineTo(4.8f, 6.24f)
                curveToRelative(0.0f, -0.795f, 0.645f, -1.44f, 1.44f, -1.44f)
                moveToRelative(4.032f, 5.472f)
                verticalLineToRelative(1.152f)
                horizontalLineToRelative(3.456f)
                verticalLineToRelative(-1.152f)
                close()
            }
        }
        .build()
        return _astral!!
    }

private var _astral: ImageVector? = null
