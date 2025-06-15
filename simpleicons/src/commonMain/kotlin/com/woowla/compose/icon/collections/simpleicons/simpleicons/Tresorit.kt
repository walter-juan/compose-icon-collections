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

public val Simpleicons.Tresorit: ImageVector
    get() {
        if (_tresorit != null) {
            return _tresorit!!
        }
        _tresorit = Builder(name = "Tresorit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.636f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.364f, -6.0f)
                lineTo(22.364f, 6.0f)
                close()
                moveTo(3.818f, 7.258f)
                lineTo(12.0f, 2.521f)
                lineToRelative(3.574f, 2.069f)
                lineToRelative(-11.756f, 6.753f)
                close()
                moveTo(20.182f, 16.742f)
                lineTo(12.0f, 21.48f)
                lineTo(3.82f, 16.742f)
                lineTo(3.82f, 13.86f)
                lineToRelative(13.938f, -8.006f)
                lineToRelative(2.425f, 1.404f)
                close()
            }
        }
        .build()
        return _tresorit!!
    }

private var _tresorit: ImageVector? = null
