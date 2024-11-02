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

public val Simpleicons.Immer: ImageVector
    get() {
        if (_immer != null) {
            return _immer!!
        }
        _immer = Builder(name = "Immer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.271f, 14.333f)
                curveTo(1.017f, 14.333f, 0.0f, 13.315f, 0.0f, 12.061f)
                reflectiveCurveToRelative(1.017f, -2.271f, 2.271f, -2.271f)
                reflectiveCurveToRelative(2.271f, 1.018f, 2.271f, 2.271f)
                reflectiveCurveToRelative(-1.018f, 2.272f, -2.271f, 2.272f)
                close()
                moveTo(21.73f, 15.191f)
                arcToRelative(3.122f, 3.122f, 0.0f, false, true, -1.822f, -0.585f)
                curveToRelative(-0.743f, 0.837f, -1.047f, 1.047f, -2.067f, 1.047f)
                curveToRelative(-1.542f, 0.0f, -3.12f, -2.321f, -4.558f, -4.315f)
                curveToRelative(1.497f, -2.336f, 2.87f, -3.879f, 4.331f, -3.879f)
                curveToRelative(1.115f, 0.0f, 2.185f, 0.494f, 2.786f, 1.767f)
                arcToRelative(3.115f, 3.115f, 0.0f, false, true, 1.329f, -0.296f)
                arcToRelative(3.105f, 3.105f, 0.0f, false, true, 1.17f, 0.226f)
                curveToRelative(-0.88f, -2.599f, -2.996f, -3.913f, -5.113f, -3.913f)
                curveToRelative(-2.334f, 0.0f, -4.059f, 2.16f, -5.575f, 4.629f)
                curveToRelative(-1.783f, -2.432f, -3.484f, -4.629f, -5.924f, -4.629f)
                curveToRelative(-2.077f, 0.0f, -4.154f, 1.286f, -5.043f, 3.829f)
                arcToRelative(3.118f, 3.118f, 0.0f, false, true, 0.936f, -0.142f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, true, 1.718f, 0.514f)
                curveToRelative(0.546f, -0.772f, 1.245f, -1.235f, 2.007f, -1.209f)
                curveToRelative(1.537f, 0.052f, 2.928f, 1.85f, 4.687f, 4.325f)
                curveToRelative(-1.28f, 1.959f, -2.923f, 3.868f, -4.31f, 3.868f)
                curveToRelative(-1.057f, 0.0f, -2.074f, -0.444f, -2.69f, -1.574f)
                arcToRelative(3.114f, 3.114f, 0.0f, false, true, -1.412f, 0.336f)
                curveToRelative(-0.371f, 0.007f, -0.734f, -0.077f, -1.085f, -0.186f)
                curveToRelative(0.932f, 2.417f, 2.972f, 3.64f, 5.013f, 3.64f)
                curveToRelative(2.326f, 0.0f, 3.931f, -2.056f, 5.525f, -4.614f)
                curveToRelative(1.748f, 2.464f, 3.499f, 4.724f, 5.992f, 4.724f)
                curveToRelative(2.024f, 0.0f, 4.297f, -1.333f, 5.223f, -3.75f)
                curveToRelative(-0.358f, 0.087f, -0.724f, 0.199f, -1.118f, 0.186f)
                close()
                moveTo(21.729f, 9.79f)
                curveToRelative(-1.253f, 0.0f, -2.27f, 1.018f, -2.27f, 2.271f)
                reflectiveCurveToRelative(1.017f, 2.272f, 2.27f, 2.272f)
                curveToRelative(1.253f, 0.0f, 2.271f, -1.018f, 2.271f, -2.272f)
                reflectiveCurveToRelative(-1.017f, -2.271f, -2.271f, -2.271f)
                close()
            }
        }
        .build()
        return _immer!!
    }

private var _immer: ImageVector? = null
