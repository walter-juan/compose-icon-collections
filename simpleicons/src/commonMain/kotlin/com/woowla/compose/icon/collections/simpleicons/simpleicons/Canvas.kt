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

public val Simpleicons.Canvas: ImageVector
    get() {
        if (_canvas != null) {
            return _canvas!!
        }
        _canvas = Builder(name = "Canvas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.44f, 15.414f)
                arcToRelative(13.706f, 13.706f, 0.0f, false, true, -0.436f, -3.44f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 0.436f, -3.44f)
                curveToRelative(1.714f, 0.21f, 3.044f, 1.669f, 3.044f, 3.44f)
                curveToRelative(0.0f, 1.771f, -1.329f, 3.23f, -3.044f, 3.44f)
                close()
                moveTo(4.413f, 11.974f)
                curveToRelative(0.0f, 0.6f, 0.487f, 1.087f, 1.087f, 1.087f)
                curveToRelative(0.601f, 0.0f, 1.088f, -0.487f, 1.088f, -1.087f)
                reflectiveCurveToRelative(-0.487f, -1.088f, -1.088f, -1.088f)
                curveToRelative(-0.601f, 0.0f, -1.087f, 0.488f, -1.087f, 1.088f)
                close()
                moveTo(23.56f, 8.534f)
                curveToRelative(-1.715f, 0.21f, -3.044f, 1.669f, -3.044f, 3.44f)
                curveToRelative(0.0f, 1.771f, 1.329f, 3.23f, 3.044f, 3.44f)
                arcToRelative(13.731f, 13.731f, 0.0f, false, false, 0.436f, -3.44f)
                curveToRelative(0.0f, -1.188f, -0.152f, -2.341f, -0.436f, -3.44f)
                close()
                moveTo(17.412f, 11.974f)
                curveToRelative(0.0f, 0.6f, 0.486f, 1.087f, 1.088f, 1.087f)
                curveToRelative(0.6f, 0.0f, 1.088f, -0.487f, 1.088f, -1.087f)
                reflectiveCurveToRelative(-0.488f, -1.088f, -1.088f, -1.088f)
                curveToRelative(-0.601f, 0.0f, -1.088f, 0.488f, -1.088f, 1.088f)
                close()
                moveTo(11.977f, 20.52f)
                curveToRelative(-1.771f, 0.0f, -3.229f, 1.33f, -3.44f, 3.044f)
                arcToRelative(13.736f, 13.736f, 0.0f, false, false, 3.441f, 0.436f)
                curveToRelative(1.189f, 0.0f, 2.34f, -0.152f, 3.44f, -0.436f)
                curveToRelative(-0.211f, -1.714f, -1.669f, -3.044f, -3.441f, -3.044f)
                close()
                moveTo(11.978f, 17.416f)
                curveToRelative(-0.601f, 0.0f, -1.088f, 0.488f, -1.088f, 1.088f)
                reflectiveCurveToRelative(0.487f, 1.088f, 1.088f, 1.088f)
                curveToRelative(0.6f, 0.0f, 1.087f, -0.487f, 1.087f, -1.088f)
                reflectiveCurveToRelative(-0.487f, -1.088f, -1.087f, -1.088f)
                close()
                moveTo(11.978f, 3.48f)
                curveToRelative(1.771f, 0.0f, 3.23f, -1.329f, 3.44f, -3.044f)
                arcTo(13.735f, 13.735f, 0.0f, false, false, 11.978f, 0.0f)
                curveToRelative(-1.189f, 0.0f, -2.341f, 0.152f, -3.441f, 0.436f)
                curveToRelative(0.211f, 1.715f, 1.669f, 3.044f, 3.441f, 3.044f)
                close()
                moveTo(11.978f, 4.409f)
                curveToRelative(-0.601f, 0.0f, -1.088f, 0.487f, -1.088f, 1.088f)
                curveToRelative(0.0f, 0.6f, 0.487f, 1.088f, 1.088f, 1.088f)
                curveToRelative(0.6f, 0.0f, 1.087f, -0.487f, 1.087f, -1.088f)
                curveToRelative(0.0f, -0.601f, -0.487f, -1.088f, -1.087f, -1.088f)
                close()
                moveTo(18.01f, 18.005f)
                curveToRelative(-1.251f, 1.252f, -1.344f, 3.221f, -0.282f, 4.582f)
                arcToRelative(13.762f, 13.762f, 0.0f, false, false, 4.864f, -4.865f)
                curveToRelative(-1.361f, -1.06f, -3.33f, -0.967f, -4.581f, 0.283f)
                close()
                moveTo(17.354f, 15.811f)
                curveToRelative(-0.425f, -0.424f, -1.113f, -0.424f, -1.539f, 0.0f)
                curveToRelative(-0.424f, 0.425f, -0.424f, 1.114f, 0.0f, 1.538f)
                curveToRelative(0.426f, 0.425f, 1.114f, 0.425f, 1.539f, 0.0f)
                curveToRelative(0.424f, -0.425f, 0.424f, -1.113f, 0.0f, -1.538f)
                close()
                moveTo(5.965f, 5.96f)
                curveToRelative(1.252f, -1.251f, 1.344f, -3.221f, 0.282f, -4.581f)
                arcToRelative(13.768f, 13.768f, 0.0f, false, false, -4.864f, 4.864f)
                curveToRelative(1.361f, 1.062f, 3.331f, 0.969f, 4.582f, -0.283f)
                close()
                moveTo(6.622f, 6.617f)
                curveToRelative(-0.424f, 0.425f, -0.424f, 1.114f, 0.0f, 1.538f)
                curveToRelative(0.424f, 0.425f, 1.114f, 0.425f, 1.538f, 0.0f)
                curveToRelative(0.425f, -0.424f, 0.425f, -1.114f, 0.0f, -1.538f)
                curveToRelative(-0.424f, -0.424f, -1.114f, -0.424f, -1.538f, 0.0f)
                close()
                moveTo(22.584f, 6.232f)
                arcToRelative(13.76f, 13.76f, 0.0f, false, false, -4.864f, -4.864f)
                curveToRelative(-1.061f, 1.361f, -0.969f, 3.33f, 0.282f, 4.582f)
                curveToRelative(1.252f, 1.251f, 3.22f, 1.344f, 4.581f, 0.282f)
                close()
                moveTo(17.346f, 8.144f)
                curveToRelative(0.424f, -0.425f, 0.424f, -1.113f, 0.0f, -1.538f)
                curveToRelative(-0.425f, -0.425f, -1.115f, -0.425f, -1.539f, 0.0f)
                curveToRelative(-0.424f, 0.425f, -0.424f, 1.113f, 0.0f, 1.538f)
                curveToRelative(0.424f, 0.424f, 1.114f, 0.424f, 1.539f, 0.0f)
                close()
                moveTo(1.377f, 17.709f)
                arcToRelative(13.763f, 13.763f, 0.0f, false, false, 4.865f, 4.865f)
                curveToRelative(1.061f, -1.361f, 0.969f, -3.33f, -0.283f, -4.582f)
                curveToRelative(-1.251f, -1.251f, -3.22f, -1.344f, -4.581f, -0.284f)
                close()
                moveTo(6.616f, 15.797f)
                curveToRelative(-0.424f, 0.425f, -0.424f, 1.114f, 0.0f, 1.538f)
                curveToRelative(0.425f, 0.425f, 1.114f, 0.425f, 1.538f, 0.0f)
                curveToRelative(0.425f, -0.425f, 0.425f, -1.114f, 0.0f, -1.538f)
                curveToRelative(-0.424f, -0.424f, -1.113f, -0.424f, -1.538f, 0.0f)
                close()
            }
        }
        .build()
        return _canvas!!
    }

private var _canvas: ImageVector? = null
