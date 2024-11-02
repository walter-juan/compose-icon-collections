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

public val Simpleicons.Teal: ImageVector
    get() {
        if (_teal != null) {
            return _teal!!
        }
        _teal = Builder(name = "Teal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.069f, 2.334f)
                verticalLineToRelative(4.129f)
                horizontalLineToRelative(7.897f)
                arcToRelative(3.168f, 3.168f, 0.0f, false, true, 2.25f, 0.947f)
                curveToRelative(0.596f, 0.604f, 0.932f, 1.425f, 0.933f, 2.281f)
                lineToRelative(0.008f, 4.244f)
                verticalLineToRelative(3.61f)
                lineTo(7.253f, 17.545f)
                arcTo(3.17f, 3.17f, 0.0f, false, true, 5.0f, 16.598f)
                arcToRelative(3.251f, 3.251f, 0.0f, false, true, -0.932f, -2.283f)
                lineTo(4.068f, 6.463f)
                lineTo(0.0f, 6.463f)
                verticalLineToRelative(8.014f)
                curveToRelative(0.0f, 0.944f, 0.184f, 1.879f, 0.541f, 2.752f)
                arcToRelative(7.193f, 7.193f, 0.0f, false, false, 1.537f, 2.332f)
                arcToRelative(7.074f, 7.074f, 0.0f, false, false, 2.301f, 1.558f)
                curveToRelative(0.86f, 0.362f, 1.783f, 0.547f, 2.714f, 0.547f)
                horizontalLineToRelative(4.723f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, false, 2.365f, -0.992f)
                curveToRelative(0.627f, -0.636f, 0.98f, -1.498f, 0.98f, -2.397f)
                verticalLineToRelative(-0.732f)
                horizontalLineToRelative(8.824f)
                lineToRelative(-2.328f, -2.283f)
                lineTo(24.0f, 12.965f)
                horizontalLineToRelative(-6.309f)
                arcToRelative(5.802f, 5.802f, 0.0f, false, false, 2.191f, -2.884f)
                arcToRelative(5.893f, 5.893f, 0.0f, false, false, 0.071f, -3.639f)
                arcToRelative(5.819f, 5.819f, 0.0f, false, false, -2.075f, -2.971f)
                arcToRelative(5.685f, 5.685f, 0.0f, false, false, -3.411f, -1.137f)
                lineTo(4.069f, 2.334f)
                close()
                moveTo(10.776f, 8.471f)
                curveToRelative(-1.212f, 0.0f, -2.194f, 0.997f, -2.194f, 2.225f)
                curveToRelative(0.0f, 1.229f, 0.982f, 2.225f, 2.194f, 2.225f)
                reflectiveCurveToRelative(2.194f, -0.996f, 2.194f, -2.225f)
                curveToRelative(0.0f, -1.228f, -0.982f, -2.225f, -2.194f, -2.225f)
                close()
            }
        }
        .build()
        return _teal!!
    }

private var _teal: ImageVector? = null
