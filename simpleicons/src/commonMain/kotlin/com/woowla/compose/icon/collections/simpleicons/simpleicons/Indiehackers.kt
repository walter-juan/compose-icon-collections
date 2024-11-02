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

public val Simpleicons.Indiehackers: ImageVector
    get() {
        if (_indiehackers != null) {
            return _indiehackers!!
        }
        _indiehackers = Builder(name = "Indiehackers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(5.4f, 17.2f)
                horizontalLineToRelative(2.4f)
                lineTo(7.8f, 6.8f)
                lineTo(5.4f, 6.8f)
                verticalLineToRelative(10.4f)
                close()
                moveTo(10.2f, 17.2f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.4f)
                lineTo(18.6f, 6.8f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(10.4f)
                close()
            }
        }
        .build()
        return _indiehackers!!
    }

private var _indiehackers: ImageVector? = null
