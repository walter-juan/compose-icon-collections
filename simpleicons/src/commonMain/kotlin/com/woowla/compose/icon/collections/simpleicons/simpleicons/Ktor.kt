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

public val Simpleicons.Ktor: ImageVector
    get() {
        if (_ktor != null) {
            return _ktor!!
        }
        _ktor = Builder(name = "Ktor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                lineTo(0.0f, 8.0f)
                lineToRelative(8.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(8.0f, 16.0f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _ktor!!
    }

private var _ktor: ImageVector? = null
