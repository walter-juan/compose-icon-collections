package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsStore: ImageVector
    get() {
        if (_bxsStore != null) {
            return _bxsStore!!
        }
        _bxsStore = Builder(name = "BxsStore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.999f, 8.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.143f, -0.515f)
                lineTo(19.147f, 2.97f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 17.433f, 2.0f)
                lineTo(6.565f, 2.0f)
                curveToRelative(-0.698f, 0.0f, -1.355f, 0.372f, -1.714f, 0.971f)
                lineTo(2.142f, 7.485f)
                arcTo(0.997f, 0.997f, 0.0f, false, false, 1.999f, 8.0f)
                curveToRelative(0.0f, 1.005f, 0.386f, 1.914f, 1.0f, 2.618f)
                lineTo(2.999f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-9.382f)
                curveToRelative(0.614f, -0.704f, 1.0f, -1.613f, 1.0f, -2.618f)
                close()
                moveTo(19.983f, 8.251f)
                arcTo(2.002f, 2.002f, 0.0f, false, true, 17.999f, 10.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.068f, -0.025f, -0.128f, -0.039f, -0.192f)
                lineToRelative(0.02f, -0.004f)
                lineTo(15.219f, 4.0f)
                horizontalLineToRelative(2.214f)
                lineToRelative(2.55f, 4.251f)
                close()
                moveTo(10.006f, 8.065f)
                lineTo(10.818f, 4.0f)
                horizontalLineToRelative(2.361f)
                lineToRelative(0.813f, 4.065f)
                curveTo(13.957f, 9.138f, 13.079f, 10.0f, 11.999f, 10.0f)
                reflectiveCurveToRelative(-1.958f, -0.862f, -1.993f, -1.935f)
                close()
                moveTo(6.565f, 4.0f)
                horizontalLineToRelative(2.214f)
                lineToRelative(-0.76f, 3.804f)
                lineToRelative(0.02f, 0.004f)
                curveToRelative(-0.015f, 0.064f, -0.04f, 0.124f, -0.04f, 0.192f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, true, -1.984f, -1.749f)
                lineTo(6.565f, 4.0f)
                close()
                moveTo(9.999f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxsStore!!
    }

private var _bxsStore: ImageVector? = null
