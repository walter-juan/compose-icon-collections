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

public val Simpleicons.Fubo: ImageVector
    get() {
        if (_fubo != null) {
            return _fubo!!
        }
        _fubo = Builder(name = "Fubo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.898f, 16.705f)
                horizontalLineTo(9.114f)
                verticalLineToRelative(-0.29f)
                curveToRelative(-0.265f, 0.196f, -0.656f, 0.416f, -1.32f, 0.416f)
                curveToRelative(-2.158f, 0.0f, -2.996f, -1.167f, -2.996f, -3.43f)
                verticalLineTo(9.809f)
                horizontalLineToRelative(1.783f)
                verticalLineToRelative(3.592f)
                curveToRelative(-0.006f, 0.616f, 0.0f, 1.778f, 1.284f, 1.778f)
                curveToRelative(1.241f, 0.0f, 1.248f, -1.1f, 1.248f, -1.765f)
                verticalLineTo(9.809f)
                horizontalLineToRelative(1.783f)
                verticalLineToRelative(6.896f)
                close()
                moveTo(4.101f, 7.207f)
                curveToRelative(-1.961f, -0.216f, -2.407f, 0.233f, -2.763f, 0.7f)
                curveToRelative(-0.316f, 0.413f, -0.357f, 0.988f, -0.357f, 1.401f)
                verticalLineToRelative(0.501f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.652f)
                horizontalLineToRelative(0.999f)
                verticalLineToRelative(5.244f)
                horizontalLineToRelative(1.783f)
                verticalLineToRelative(-5.244f)
                horizontalLineToRelative(1.346f)
                verticalLineTo(9.809f)
                horizontalLineToRelative(-1.31f)
                verticalLineToRelative(-0.465f)
                curveToRelative(0.0f, -0.474f, 0.38f, -0.533f, 0.571f, -0.521f)
                lineToRelative(0.392f, 0.018f)
                lineToRelative(0.32f, -1.634f)
                close()
                moveTo(24.0f, 13.257f)
                curveToRelative(0.0f, -1.984f, -1.594f, -3.592f, -3.561f, -3.592f)
                curveToRelative(-0.835f, 0.0f, -1.603f, 0.29f, -2.21f, 0.775f)
                curveToRelative(0.384f, 0.44f, 0.677f, 0.965f, 0.85f, 1.543f)
                arcToRelative(1.707f, 1.707f, 0.0f, false, true, 1.337f, -0.666f)
                curveToRelative(0.975f, 0.0f, 1.765f, 0.86f, 1.765f, 1.922f)
                curveToRelative(0.0f, 1.061f, -0.79f, 1.922f, -1.765f, 1.922f)
                curveToRelative(-0.969f, 0.0f, -1.757f, -0.851f, -1.765f, -1.904f)
                curveToRelative(0.0f, -0.913f, -0.332f, -1.747f, -0.878f, -2.381f)
                arcToRelative(3.447f, 3.447f, 0.0f, false, false, -2.617f, -1.211f)
                curveToRelative(-0.651f, 0.0f, -1.261f, 0.183f, -1.783f, 0.502f)
                verticalLineTo(7.259f)
                lineToRelative(-1.783f, 0.35f)
                verticalLineToRelative(9.097f)
                horizontalLineToRelative(1.783f)
                verticalLineToRelative(-0.288f)
                curveToRelative(0.522f, 0.319f, 1.132f, 0.432f, 1.783f, 0.432f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, 2.176f, -0.781f)
                arcToRelative(4.215f, 4.215f, 0.0f, false, true, -0.876f, -1.537f)
                curveToRelative(-0.321f, 0.429f, -0.8f, 0.702f, -1.336f, 0.702f)
                curveToRelative(-0.965f, 0.0f, -1.747f, -0.884f, -1.747f, -1.975f)
                reflectiveCurveToRelative(0.782f, -1.975f, 1.747f, -1.975f)
                curveToRelative(0.965f, 0.0f, 1.748f, 0.885f, 1.748f, 1.976f)
                curveToRelative(0.0f, 1.984f, 1.6f, 3.591f, 3.566f, 3.591f)
                curveTo(22.4f, 16.849f, 24.0f, 15.241f, 24.0f, 13.257f)
            }
        }
        .build()
        return _fubo!!
    }

private var _fubo: ImageVector? = null
