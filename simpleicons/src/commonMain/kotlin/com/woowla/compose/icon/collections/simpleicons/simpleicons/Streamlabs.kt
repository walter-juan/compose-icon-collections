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

public val Simpleicons.Streamlabs: ImageVector
    get() {
        if (_streamlabs != null) {
            return _streamlabs!!
        }
        _streamlabs = Builder(name = "Streamlabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.688f, 1.346f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -0.273f, 0.006f)
                curveToRelative(-0.528f, 0.066f, -1.013f, 0.162f, -1.484f, 0.309f)
                arcTo(10.057f, 10.057f, 0.0f, false, false, 0.321f, 8.27f)
                curveToRelative(-0.147f, 0.471f, -0.244f, 0.958f, -0.31f, 1.486f)
                curveToRelative(-0.091f, 0.734f, 0.431f, 1.404f, 1.166f, 1.496f)
                curveToRelative(0.734f, 0.091f, 1.404f, -0.43f, 1.496f, -1.164f)
                curveToRelative(0.05f, -0.406f, 0.119f, -0.732f, 0.209f, -1.02f)
                arcTo(7.374f, 7.374f, 0.0f, false, true, 7.727f, 4.221f)
                curveToRelative(0.288f, -0.09f, 0.614f, -0.157f, 1.02f, -0.207f)
                curveToRelative(0.735f, -0.092f, 1.255f, -0.763f, 1.164f, -1.498f)
                arcToRelative(1.339f, 1.339f, 0.0f, false, false, -1.223f, -1.17f)
                close()
                moveTo(12.737f, 6.569f)
                curveToRelative(-2.629f, 0.0f, -3.943f, 0.001f, -4.947f, 0.512f)
                arcTo(4.684f, 4.684f, 0.0f, false, false, 5.741f, 9.131f)
                curveToRelative(-0.512f, 1.004f, -0.512f, 2.318f, -0.512f, 4.947f)
                verticalLineToRelative(4.289f)
                curveToRelative(0.0f, 1.502f, -0.001f, 2.254f, 0.291f, 2.828f)
                curveToRelative(0.257f, 0.505f, 0.668f, 0.915f, 1.172f, 1.172f)
                curveToRelative(0.574f, 0.292f, 1.326f, 0.291f, 2.828f, 0.291f)
                horizontalLineToRelative(6.971f)
                curveToRelative(2.628f, 0.0f, 3.944f, 0.001f, 4.947f, -0.51f)
                arcToRelative(4.688f, 4.688f, 0.0f, false, false, 2.051f, -2.051f)
                curveToRelative(0.512f, -1.004f, 0.512f, -2.318f, 0.512f, -4.947f)
                verticalLineToRelative(-1.072f)
                curveToRelative(0.0f, -2.629f, 0.0f, -3.943f, -0.512f, -4.947f)
                arcToRelative(4.688f, 4.688f, 0.0f, false, false, -2.051f, -2.051f)
                curveToRelative(-1.003f, -0.511f, -2.319f, -0.512f, -4.947f, -0.512f)
                close()
                moveTo(13.274f, 13.274f)
                curveToRelative(0.741f, 0.0f, 1.34f, 0.6f, 1.34f, 1.34f)
                verticalLineToRelative(2.684f)
                curveToRelative(0.0f, 0.74f, -0.599f, 1.34f, -1.34f, 1.34f)
                curveToRelative(-0.74f, 0.0f, -1.342f, -0.6f, -1.342f, -1.34f)
                verticalLineToRelative(-2.684f)
                curveToRelative(0.0f, -0.74f, 0.602f, -1.34f, 1.342f, -1.34f)
                close()
                moveTo(18.637f, 13.274f)
                curveToRelative(0.74f, 0.0f, 1.34f, 0.6f, 1.34f, 1.34f)
                verticalLineToRelative(2.684f)
                curveToRelative(0.0f, 0.74f, -0.6f, 1.34f, -1.34f, 1.34f)
                curveToRelative(-0.741f, 0.0f, -1.34f, -0.6f, -1.34f, -1.34f)
                verticalLineToRelative(-2.684f)
                curveToRelative(0.0f, -0.74f, 0.599f, -1.34f, 1.34f, -1.34f)
                close()
            }
        }
        .build()
        return _streamlabs!!
    }

private var _streamlabs: ImageVector? = null
