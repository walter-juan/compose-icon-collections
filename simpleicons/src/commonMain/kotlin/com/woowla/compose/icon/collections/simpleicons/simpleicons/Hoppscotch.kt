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

public val Simpleicons.Hoppscotch: ImageVector
    get() {
        if (_hoppscotch != null) {
            return _hoppscotch!!
        }
        _hoppscotch = Builder(name = "Hoppscotch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.632f, 4.746f)
                arcToRelative(8.894f, 8.894f, 0.0f, false, true, 5.29f, 7.938f)
                curveToRelative(1.867f, 1.47f, 3.723f, 3.527f, 2.86f, 5.465f)
                curveToRelative(-0.968f, 2.174f, -4.415f, 2.085f, -8.334f, 0.985f)
                arcTo(7.113f, 7.113f, 0.0f, false, true, 5.063f, 14.51f)
                curveTo(1.623f, 12.334f, -0.75f, 9.832f, 0.218f, 7.658f)
                curveToRelative(0.863f, -1.939f, 3.634f, -1.936f, 5.975f, -1.532f)
                arcToRelative(8.894f, 8.894f, 0.0f, false, true, 9.439f, -1.38f)
                close()
                moveTo(1.862f, 8.39f)
                curveToRelative(-0.47f, 1.056f, 2.056f, 4.054f, 8.972f, 7.133f)
                curveToRelative(6.916f, 3.08f, 10.834f, 2.95f, 11.304f, 1.894f)
                curveToRelative(0.39f, -0.874f, -1.212f, -2.554f, -3.046f, -3.856f)
                curveToRelative(-1.426f, -1.02f, -3.38f, -2.143f, -5.929f, -3.278f)
                curveToRelative(-0.694f, -0.309f, -0.964f, -1.133f, -0.673f, -1.788f)
                curveToRelative(0.292f, -0.655f, 0.933f, -1.093f, 2.282f, -1.156f)
                curveToRelative(0.635f, -0.002f, 0.718f, -0.178f, 0.747f, -0.329f)
                curveToRelative(0.036f, -0.233f, -0.287f, -0.47f, -0.62f, -0.618f)
                curveToRelative(-2.647f, -1.179f, -5.888f, -0.685f, -8.134f, 1.68f)
                curveToRelative(-2.195f, -0.491f, -4.514f, -0.556f, -4.903f, 0.318f)
                close()
                moveTo(12.945f, 14.056f)
                curveToRelative(-0.24f, 0.54f, -0.98f, 0.735f, -1.651f, 0.436f)
                reflectiveCurveToRelative(-1.02f, -0.979f, -0.78f, -1.518f)
                curveToRelative(0.24f, -0.54f, 0.979f, -0.735f, 1.65f, -0.436f)
                curveToRelative(0.671f, 0.299f, 1.021f, 0.979f, 0.78f, 1.518f)
                close()
                moveTo(16.965f, 16.383f)
                curveToRelative(0.703f, 0.202f, 1.404f, -0.093f, 1.566f, -0.658f)
                curveToRelative(0.162f, -0.564f, -0.276f, -1.186f, -0.98f, -1.387f)
                curveToRelative(-0.702f, -0.202f, -1.403f, 0.093f, -1.565f, 0.658f)
                curveToRelative(-0.162f, 0.564f, 0.276f, 1.186f, 0.98f, 1.387f)
                close()
                moveTo(7.218f, 9.737f)
                curveToRelative(0.62f, 0.388f, 0.87f, 1.106f, 0.559f, 1.604f)
                curveToRelative(-0.311f, 0.498f, -1.066f, 0.588f, -1.686f, 0.2f)
                curveToRelative(-0.62f, -0.387f, -0.87f, -1.105f, -0.56f, -1.604f)
                curveToRelative(0.312f, -0.498f, 1.067f, -0.588f, 1.687f, -0.2f)
                close()
            }
        }
        .build()
        return _hoppscotch!!
    }

private var _hoppscotch: ImageVector? = null
