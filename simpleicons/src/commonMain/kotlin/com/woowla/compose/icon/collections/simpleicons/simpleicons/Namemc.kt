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

public val Simpleicons.Namemc: ImageVector
    get() {
        if (_namemc != null) {
            return _namemc!!
        }
        _namemc = Builder(name = "Namemc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(4.8f, 4.8f)
                lineTo(16.0f, 4.8f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(3.2f)
                verticalLineToRelative(11.2f)
                lineTo(16.0f, 19.2f)
                lineTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(11.2f)
                lineTo(4.8f, 19.2f)
                lineTo(4.8f, 8.0f)
                close()
            }
        }
        .build()
        return _namemc!!
    }

private var _namemc: ImageVector? = null
