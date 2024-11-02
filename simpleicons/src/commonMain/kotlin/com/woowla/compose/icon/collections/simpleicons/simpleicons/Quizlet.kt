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

public val Simpleicons.Quizlet: ImageVector
    get() {
        if (_quizlet != null) {
            return _quizlet!!
        }
        _quizlet = Builder(name = "Quizlet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.779f, 0.025f)
                arcToRelative(11.789f, 11.789f, 0.0f, false, false, -5.338f, 0.896f)
                arcTo(11.829f, 11.829f, 0.0f, false, false, 3.058f, 4.11f)
                arcTo(11.928f, 11.928f, 0.0f, false, false, 0.427f, 14.363f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, 2.3f, 4.921f)
                arcToRelative(11.842f, 11.842f, 0.0f, false, false, 4.24f, 3.378f)
                arcToRelative(11.783f, 11.783f, 0.0f, false, false, 10.533f, -0.226f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, true, 0.331f, 0.018f)
                arcToRelative(9.136f, 9.136f, 0.0f, false, false, 5.197f, 1.545f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, false, 0.332f, -0.332f)
                verticalLineToRelative(-4.038f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, false, -0.276f, -0.331f)
                arcToRelative(4.732f, 4.732f, 0.0f, false, true, -1.106f, -0.319f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, true, -0.191f, -0.352f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.05f, -0.133f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, false, 0.772f, -11.871f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, -4.042f, -4.628f)
                arcTo(11.793f, 11.793f, 0.0f, false, false, 12.765f, 0.018f)
                lineToRelative(0.013f, 0.007f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(4.843f, 11.898f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, true, 1.205f, -4.005f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, true, 3.215f, -2.657f)
                arcToRelative(7.133f, 7.133f, 0.0f, false, true, 7.815f, 1.558f)
                arcToRelative(7.239f, 7.239f, 0.0f, false, true, 1.555f, 7.854f)
                arcToRelative(7.202f, 7.202f, 0.0f, false, true, -2.643f, 3.234f)
                arcToRelative(7.147f, 7.147f, 0.0f, false, true, -9.049f, -0.896f)
                arcToRelative(7.228f, 7.228f, 0.0f, false, true, -2.103f, -5.089f)
                lineToRelative(0.005f, 0.001f)
                close()
            }
        }
        .build()
        return _quizlet!!
    }

private var _quizlet: ImageVector? = null
