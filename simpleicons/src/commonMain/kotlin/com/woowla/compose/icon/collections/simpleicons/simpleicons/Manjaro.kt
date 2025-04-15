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

public val Simpleicons.Manjaro: ImageVector
    get() {
        if (_manjaro != null) {
            return _manjaro!!
        }
        _manjaro = Builder(name = "Manjaro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.182f, 0.0f)
                arcTo(2.177f, 2.177f, 0.0f, false, false, 0.0f, 2.182f)
                verticalLineToRelative(19.636f)
                curveTo(0.0f, 23.027f, 0.973f, 24.0f, 2.182f, 24.0f)
                horizontalLineToRelative(4.363f)
                lineTo(6.545f, 6.545f)
                horizontalLineToRelative(8.728f)
                lineTo(15.273f, 0.0f)
                close()
                moveTo(17.455f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(4.363f)
                arcTo(2.177f, 2.177f, 0.0f, false, false, 24.0f, 21.818f)
                lineTo(24.0f, 2.182f)
                arcTo(2.177f, 2.177f, 0.0f, false, false, 21.818f, 0.0f)
                close()
                moveTo(8.727f, 8.727f)
                lineTo(8.727f, 24.0f)
                horizontalLineToRelative(6.546f)
                lineTo(15.273f, 8.727f)
                close()
            }
        }
        .build()
        return _manjaro!!
    }

private var _manjaro: ImageVector? = null
