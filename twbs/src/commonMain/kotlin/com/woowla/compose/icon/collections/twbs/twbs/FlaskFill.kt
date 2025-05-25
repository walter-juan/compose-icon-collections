package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FlaskFill: ImageVector
    get() {
        if (_flaskFill != null) {
            return _flaskFill!!
        }
        _flaskFill = Builder(name = "FlaskFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(11.0f, 1.0f)
                verticalLineToRelative(5.358f)
                lineToRelative(4.497f, 7.36f)
                curveToRelative(0.099f, 0.162f, 0.16f, 0.332f, 0.192f, 0.503f)
                lineToRelative(0.013f, 0.063f)
                lineToRelative(0.008f, 0.083f)
                quadToRelative(0.006f, 0.053f, 0.007f, 0.107f)
                lineToRelative(-0.003f, 0.09f)
                quadToRelative(-0.001f, 0.047f, -0.005f, 0.095f)
                quadToRelative(-0.006f, 0.053f, -0.017f, 0.106f)
                lineToRelative(-0.016f, 0.079f)
                quadToRelative(-0.012f, 0.049f, -0.028f, 0.096f)
                lineToRelative(-0.028f, 0.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.17f, 0.322f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.395f, 0.394f)
                quadToRelative(-0.04f, 0.028f, -0.082f, 0.054f)
                quadToRelative(-0.045f, 0.026f, -0.095f, 0.049f)
                lineToRelative(-0.073f, 0.035f)
                lineToRelative(-0.09f, 0.033f)
                quadToRelative(-0.05f, 0.02f, -0.103f, 0.034f)
                quadToRelative(-0.04f, 0.01f, -0.08f, 0.017f)
                quadToRelative(-0.053f, 0.012f, -0.108f, 0.021f)
                lineToRelative(-0.006f, 0.002f)
                lineToRelative(-0.202f, 0.013f)
                lineTo(1.783f, 16.0f)
                lineToRelative(-0.214f, -0.015f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, true, -1.066f, -2.268f)
                lineTo(5.0f, 6.359f)
                lineTo(5.0f, 1.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, -0.354f, -0.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 0.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.885f)
                lineToRelative(-0.61f, -1.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.664f)
                lineToRelative(-0.612f, -1.0f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.441f)
                lineToRelative(-0.61f, -1.0f)
                close()
                moveTo(9.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.22f)
                lineToRelative(-0.147f, -0.24f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 6.5f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(9.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _flaskFill!!
    }

private var _flaskFill: ImageVector? = null
