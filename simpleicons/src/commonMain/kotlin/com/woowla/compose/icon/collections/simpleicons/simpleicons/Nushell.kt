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

public val Simpleicons.Nushell: ImageVector
    get() {
        if (_nushell != null) {
            return _nushell!!
        }
        _nushell = Builder(name = "Nushell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 16.338f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-5.7f)
                curveToRelative(0.417f, -0.624f, 1.205f, -1.309f, 2.127f, -1.309f)
                curveToRelative(1.176f, 0.0f, 1.34f, 0.64f, 1.34f, 2.247f)
                verticalLineToRelative(4.762f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-5.685f)
                curveToRelative(0.0f, -1.458f, -0.67f, -2.32f, -2.202f, -2.32f)
                curveToRelative(-0.923f, 0.0f, -1.964f, 0.46f, -2.59f, 1.264f)
                lineToRelative(-0.103f, -1.1f)
                lineTo(0.0f, 8.497f)
                close()
                moveTo(10.177f, 8.496f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(5.698f)
                curveToRelative(0.0f, 1.46f, 0.745f, 2.307f, 2.263f, 2.307f)
                curveToRelative(0.921f, 0.0f, 1.889f, -0.431f, 2.514f, -1.22f)
                lineToRelative(0.104f, 1.057f)
                horizontalLineToRelative(1.072f)
                lineTo(14.88f, 8.496f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(5.773f)
                curveToRelative(-0.432f, 0.67f, -1.265f, 1.25f, -2.129f, 1.25f)
                curveToRelative(-0.907f, 0.0f, -1.324f, -0.446f, -1.324f, -1.458f)
                close()
                moveTo(18.287f, 7.499f)
                lineTo(17.677f, 8.451f)
                lineTo(22.928f, 11.68f)
                lineTo(17.677f, 14.924f)
                lineTo(18.346f, 15.846f)
                lineTo(24.0f, 12.32f)
                verticalLineToRelative(-1.28f)
                close()
            }
        }
        .build()
        return _nushell!!
    }

private var _nushell: ImageVector? = null
