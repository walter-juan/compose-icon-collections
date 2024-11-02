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

public val Simpleicons.Googlechat: ImageVector
    get() {
        if (_googlechat != null) {
            return _googlechat!!
        }
        _googlechat = Builder(name = "Googlechat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.637f, 0.0f)
                curveTo(0.733f, 0.0f, 0.0f, 0.733f, 0.0f, 1.637f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.904f, 0.733f, 1.636f, 1.637f, 1.636f)
                horizontalLineToRelative(3.955f)
                verticalLineToRelative(3.323f)
                curveToRelative(0.0f, 0.804f, 0.97f, 1.207f, 1.539f, 0.638f)
                lineToRelative(3.963f, -3.96f)
                horizontalLineToRelative(11.27f)
                curveToRelative(0.903f, 0.0f, 1.636f, -0.733f, 1.636f, -1.637f)
                lineTo(24.0f, 5.592f)
                lineTo(18.408f, 0.0f)
                close()
                moveTo(5.592f, 5.592f)
                horizontalLineToRelative(12.816f)
                verticalLineToRelative(8.59f)
                lineTo(8.455f, 14.182f)
                lineToRelative(-2.863f, 2.863f)
                close()
            }
        }
        .build()
        return _googlechat!!
    }

private var _googlechat: ImageVector? = null
