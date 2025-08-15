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

public val Simpleicons.Myshows: ImageVector
    get() {
        if (_myshows != null) {
            return _myshows!!
        }
        _myshows = Builder(name = "Myshows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.94f, 1.897f)
                curveToRelative(-0.375f, 0.189f, -0.81f, 0.117f, -1.14f, -0.213f)
                curveToRelative(-0.421f, -0.42f, -0.421f, -1.01f, 0.0f, -1.431f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, true, 1.432f, 0.0f)
                curveToRelative(0.33f, 0.33f, 0.401f, 0.764f, 0.213f, 1.139f)
                lineToRelative(3.323f, 3.324f)
                lineToRelative(0.032f, 0.033f)
                arcToRelative(3.247f, 3.247f, 0.0f, false, true, 2.242f, -0.875f)
                curveToRelative(0.857f, 0.0f, 1.615f, 0.316f, 2.189f, 0.843f)
                verticalLineToRelative(-0.001f)
                lineToRelative(3.297f, -3.225f)
                curveToRelative(-0.256f, -0.395f, -0.203f, -0.879f, 0.156f, -1.238f)
                curveToRelative(0.421f, -0.337f, 1.095f, -0.337f, 1.432f, 0.0f)
                curveToRelative(0.42f, 0.42f, 0.42f, 1.01f, 0.0f, 1.431f)
                curveToRelative(-0.297f, 0.297f, -0.676f, 0.384f, -1.022f, 0.264f)
                lineTo(14.821f, 5.22f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.093f, 0.076f)
                curveToRelative(0.327f, 0.482f, 0.539f, 1.06f, 0.598f, 1.692f)
                horizontalLineTo(8.842f)
                curveToRelative(0.0f, -0.635f, 0.185f, -1.217f, 0.505f, -1.701f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, -0.084f, -0.067f)
                close()
                moveTo(4.883f, 24.0f)
                curveTo(2.442f, 24.0f, 0.421f, 21.979f, 0.421f, 19.537f)
                verticalLineToRelative(-7.242f)
                curveToRelative(0.0f, -2.442f, 2.021f, -4.463f, 4.463f, -4.463f)
                horizontalLineToRelative(14.232f)
                curveToRelative(2.442f, 0.0f, 4.463f, 2.02f, 4.463f, 4.463f)
                verticalLineToRelative(7.242f)
                curveToRelative(0.0f, 2.442f, -2.021f, 4.463f, -4.463f, 4.463f)
                close()
                moveTo(3.032f, 13.137f)
                verticalLineToRelative(5.642f)
                curveToRelative(0.0f, 1.347f, 1.094f, 2.526f, 2.526f, 2.526f)
                horizontalLineToRelative(12.968f)
                curveToRelative(1.348f, 0.0f, 2.527f, -1.094f, 2.527f, -2.526f)
                verticalLineToRelative(-5.642f)
                curveToRelative(0.0f, -1.348f, -1.095f, -2.526f, -2.527f, -2.526f)
                horizontalLineTo(5.558f)
                curveToRelative(-1.432f, 0.0f, -2.526f, 1.094f, -2.526f, 2.526f)
                close()
            }
        }
        .build()
        return _myshows!!
    }

private var _myshows: ImageVector? = null
