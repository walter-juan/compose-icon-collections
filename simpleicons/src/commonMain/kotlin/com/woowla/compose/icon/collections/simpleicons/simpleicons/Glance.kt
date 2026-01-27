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

public val Simpleicons.Glance: ImageVector
    get() {
        if (_glance != null) {
            return _glance!!
        }
        _glance = Builder(name = "Glance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.77f, 0.0f)
                arcTo(2.763f, 2.763f, 0.0f, false, false, 0.0f, 2.77f)
                verticalLineToRelative(18.46f)
                arcTo(2.763f, 2.763f, 0.0f, false, false, 2.77f, 24.0f)
                horizontalLineToRelative(18.46f)
                arcTo(2.763f, 2.763f, 0.0f, false, false, 24.0f, 21.23f)
                lineTo(24.0f, 2.77f)
                arcTo(2.763f, 2.763f, 0.0f, false, false, 21.23f, 0.0f)
                close()
                moveTo(3.692f, 1.846f)
                horizontalLineToRelative(5.539f)
                curveToRelative(1.023f, 0.0f, 1.846f, 0.824f, 1.846f, 1.846f)
                verticalLineToRelative(16.616f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, 1.846f)
                lineTo(3.692f, 22.154f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, -1.846f)
                lineTo(1.846f, 3.692f)
                curveToRelative(0.0f, -1.022f, 0.824f, -1.846f, 1.846f, -1.846f)
                close()
                moveTo(14.769f, 1.846f)
                horizontalLineToRelative(5.539f)
                curveToRelative(1.022f, 0.0f, 1.846f, 0.824f, 1.846f, 1.846f)
                verticalLineToRelative(5.539f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, 1.846f)
                horizontalLineToRelative(-5.539f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, -1.846f)
                lineTo(12.923f, 3.692f)
                curveToRelative(0.0f, -1.022f, 0.823f, -1.846f, 1.846f, -1.846f)
                close()
                moveTo(15.995f, 3.692f)
                lineTo(15.049f, 4.653f)
                horizontalLineToRelative(2.964f)
                curveToRelative(0.148f, 0.0f, 0.29f, -0.005f, 0.423f, -0.012f)
                arcToRelative(0.78f, 0.78f, 0.0f, false, false, 0.312f, -0.089f)
                lineTo(14.77f, 8.528f)
                lineToRelative(0.725f, 0.703f)
                lineToRelative(3.923f, -3.941f)
                arcToRelative(1.031f, 1.031f, 0.0f, false, false, -0.1f, 0.322f)
                arcToRelative(3.265f, 3.265f, 0.0f, false, false, -0.023f, 0.38f)
                verticalLineToRelative(3.071f)
                lineToRelative(1.014f, -1.004f)
                lineTo(20.309f, 3.692f)
                close()
                moveTo(14.769f, 12.923f)
                horizontalLineToRelative(5.539f)
                curveToRelative(1.022f, 0.0f, 1.846f, 0.823f, 1.846f, 1.846f)
                verticalLineToRelative(5.539f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, 1.846f)
                horizontalLineToRelative(-5.539f)
                arcToRelative(1.842f, 1.842f, 0.0f, false, true, -1.846f, -1.846f)
                verticalLineToRelative(-5.539f)
                curveToRelative(0.0f, -1.023f, 0.823f, -1.846f, 1.846f, -1.846f)
                close()
            }
        }
        .build()
        return _glance!!
    }

private var _glance: ImageVector? = null
