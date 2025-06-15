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

public val Simpleicons.Cobalt: ImageVector
    get() {
        if (_cobalt != null) {
            return _cobalt!!
        }
        _cobalt = Builder(name = "Cobalt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.363f)
                verticalLineToRelative(2.778f)
                lineToRelative(9.475f, 5.152f)
                lineTo(0.0f, 16.859f)
                verticalLineToRelative(2.778f)
                lineToRelative(12.857f, -6.418f)
                lineTo(12.857f, 11.49f)
                close()
                moveTo(11.143f, 4.363f)
                verticalLineToRelative(2.778f)
                lineToRelative(9.474f, 5.152f)
                lineToRelative(-9.474f, 4.566f)
                verticalLineToRelative(2.778f)
                lineTo(24.0f, 13.219f)
                lineTo(24.0f, 11.49f)
                close()
            }
        }
        .build()
        return _cobalt!!
    }

private var _cobalt: ImageVector? = null
