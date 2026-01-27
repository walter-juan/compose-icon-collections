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

public val Simpleicons.Livekit: ImageVector
    get() {
        if (_livekit != null) {
            return _livekit!!
        }
        _livekit = Builder(name = "Livekit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(14.4f)
                verticalLineToRelative(-4.799f)
                horizontalLineToRelative(4.8f)
                lineTo(19.2f, 24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(-4.799f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(4.8f)
                lineTo(4.8f, 19.2f)
                lineTo(4.8f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(14.4f, 14.4f)
                lineTo(14.4f, 9.602f)
                horizontalLineToRelative(4.801f)
                lineTo(19.201f, 4.8f)
                lineTo(24.0f, 4.8f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(4.8f)
                lineTo(9.6f, 9.6f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(4.8f)
                close()
            }
        }
        .build()
        return _livekit!!
    }

private var _livekit: ImageVector? = null
