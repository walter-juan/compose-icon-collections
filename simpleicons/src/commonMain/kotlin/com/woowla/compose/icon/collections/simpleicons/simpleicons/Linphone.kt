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

public val Simpleicons.Linphone: ImageVector
    get() {
        if (_linphone != null) {
            return _linphone!!
        }
        _linphone = Builder(name = "Linphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.976f, 0.001f)
                curveTo(0.87f, -0.005f, 0.787f, 0.01f, 0.737f, 0.047f)
                curveToRelative(-0.533f, 0.41f, 1.518f, 4.677f, 1.518f, 4.677f)
                reflectiveCurveToRelative(-2.38f, 3.282f, -2.01f, 4.76f)
                curveTo(0.232f, 9.425f, 1.804f, 7.76f, 1.804f, 7.76f)
                curveToRelative(0.082f, 0.451f, 3.897f, 1.56f, 3.897f, 1.56f)
                curveToRelative(0.507f, 0.322f, 0.682f, 0.554f, 0.78f, 1.066f)
                verticalLineToRelative(1.97f)
                curveToRelative(1.318f, 0.82f, 2.529f, 1.091f, 5.456f, 1.271f)
                curveToRelative(3.111f, -0.133f, 4.396f, -0.408f, 5.539f, -1.272f)
                curveToRelative(0.0f, 0.0f, -0.123f, -1.518f, 0.0f, -2.051f)
                curveToRelative(0.123f, -0.534f, 0.396f, -0.838f, 0.82f, -0.985f)
                curveToRelative(1.583f, -0.362f, 2.365f, -0.758f, 3.857f, -1.518f)
                lineToRelative(1.64f, 1.682f)
                curveToRelative(-0.249f, -1.849f, -0.677f, -2.873f, -1.968f, -4.676f)
                curveToRelative(-1.026f, -1.172f, -1.683f, -1.786f, -3.036f, -2.79f)
                curveToRelative(-1.472f, -0.87f, -2.288f, -1.201f, -3.734f, -1.6f)
                curveToRelative(-2.509f, -0.514f, -3.892f, -0.512f, -6.318f, 0.0f)
                curveToRelative(-1.486f, 0.448f, -2.227f, 0.786f, -3.323f, 1.6f)
                curveToRelative(0.0f, 0.0f, -3.403f, -1.954f, -4.438f, -2.016f)
                close()
                moveTo(23.714f, 14.441f)
                curveToRelative(-1.648f, 1.293f, -2.719f, 2.048f, -4.759f, 2.995f)
                curveToRelative(-2.524f, 0.996f, -3.993f, 1.315f, -6.728f, 1.395f)
                curveToRelative(-3.186f, -0.055f, -4.74f, -0.37f, -7.139f, -1.395f)
                curveToRelative(-1.905f, -0.834f, -2.938f, -1.464f, -4.717f, -2.871f)
                curveToRelative(0.427f, 1.77f, 0.826f, 2.703f, 1.805f, 4.266f)
                curveToRelative(1.042f, 1.411f, 1.683f, 2.04f, 2.912f, 2.913f)
                curveToRelative(1.33f, 0.913f, 2.128f, 1.312f, 3.652f, 1.805f)
                curveToRelative(1.369f, 0.33f, 2.132f, 0.434f, 3.487f, 0.451f)
                curveToRelative(1.381f, -0.069f, 2.098f, -0.22f, 3.282f, -0.492f)
                curveToRelative(1.306f, -0.52f, 1.97f, -0.848f, 3.077f, -1.477f)
                curveToRelative(1.834f, 1.036f, 4.102f, 2.216f, 4.43f, 1.723f)
                curveToRelative(0.329f, -0.492f, -1.476f, -4.472f, -1.476f, -4.472f)
                curveToRelative(1.204f, -1.724f, 1.696f, -2.885f, 2.174f, -4.84f)
                close()
            }
        }
        .build()
        return _linphone!!
    }

private var _linphone: ImageVector? = null
