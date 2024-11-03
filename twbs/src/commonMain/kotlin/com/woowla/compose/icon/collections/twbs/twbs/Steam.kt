package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Steam: ImageVector
    get() {
        if (_steam != null) {
            return _steam!!
        }
        _steam = Builder(name = "Steam", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.329f, 10.333f)
                arcTo(8.01f, 8.01f, 0.0f, false, false, 7.99f, 16.0f)
                curveTo(12.414f, 16.0f, 16.0f, 12.418f, 16.0f, 8.0f)
                reflectiveCurveToRelative(-3.586f, -8.0f, -8.009f, -8.0f)
                arcTo(8.006f, 8.006f, 0.0f, false, false, 0.0f, 7.468f)
                lineToRelative(0.003f, 0.006f)
                lineToRelative(4.304f, 1.769f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 5.62f, 8.88f)
                lineToRelative(1.96f, -2.844f)
                lineToRelative(-0.001f, -0.04f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, 3.042f, -3.043f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, 3.042f, 3.043f)
                arcToRelative(3.047f, 3.047f, 0.0f, false, true, -3.111f, 3.044f)
                lineToRelative(-2.804f, 2.0f)
                arcToRelative(2.223f, 2.223f, 0.0f, false, true, -3.075f, 2.11f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, -1.312f, -1.568f)
                lineTo(0.33f, 10.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.868f, 12.683f)
                arcToRelative(1.715f, 1.715f, 0.0f, false, false, 1.318f, -3.165f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.263f, -0.02f)
                lineToRelative(1.023f, 0.424f)
                arcToRelative(1.261f, 1.261f, 0.0f, true, true, -0.97f, 2.33f)
                lineToRelative(-0.99f, -0.41f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, 0.882f, 0.84f)
                close()
                moveTo(8.594f, 5.996f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, 2.027f, 2.029f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, 2.027f, -2.029f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.027f, -2.027f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.027f, 2.027f)
                moveToRelative(2.03f, -1.527f)
                arcToRelative(1.524f, 1.524f, 0.0f, true, true, -0.002f, 3.048f)
                arcToRelative(1.524f, 1.524f, 0.0f, false, true, 0.002f, -3.048f)
            }
        }
        .build()
        return _steam!!
    }

private var _steam: ImageVector? = null
