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

public val Simpleicons.Cloudron: ImageVector
    get() {
        if (_cloudron != null) {
            return _cloudron!!
        }
        _cloudron = Builder(name = "Cloudron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.016f, 0.86f)
                curveToRelative(-2.676f, -0.004f, -5.353f, 0.182f, -6.002f, 0.562f)
                curveTo(4.714f, 2.182f, 0.002f, 10.46f, 0.0f, 11.984f)
                curveToRelative(-0.002f, 1.525f, 4.69f, 9.813f, 5.986f, 10.577f)
                curveToRelative(1.297f, 0.764f, 10.701f, 0.778f, 12.0f, 0.017f)
                curveToRelative(1.3f, -0.76f, 6.012f, -9.038f, 6.014f, -10.562f)
                curveToRelative(0.002f, -1.525f, -4.69f, -9.813f, -5.986f, -10.577f)
                curveToRelative(-0.649f, -0.382f, -3.323f, -0.576f, -5.998f, -0.58f)
                close()
                moveTo(11.748f, 5.223f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.85f, 0.0f, 1.534f, 0.682f, 1.534f, 1.53f)
                lineTo(15.662f, 9.23f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, -1.533f, 1.533f)
                horizontalLineToRelative(-2.381f)
                curveToRelative(-0.127f, 0.0f, -0.25f, -0.018f, -0.367f, -0.047f)
                lineToRelative(0.002f, 0.047f)
                verticalLineToRelative(2.476f)
                lineToRelative(-0.002f, 0.047f)
                curveToRelative(0.117f, -0.029f, 0.24f, -0.047f, 0.367f, -0.047f)
                horizontalLineToRelative(2.38f)
                arcToRelative(1.53f, 1.53f, 0.0f, false, true, 1.534f, 1.533f)
                verticalLineToRelative(2.475f)
                curveToRelative(0.0f, 0.849f, -0.684f, 1.531f, -1.533f, 1.531f)
                horizontalLineToRelative(-2.381f)
                arcToRelative(1.529f, 1.529f, 0.0f, false, true, -1.533f, -1.53f)
                lineTo(10.215f, 14.77f)
                lineToRelative(0.002f, -0.046f)
                arcToRelative(1.538f, 1.538f, 0.0f, false, true, -0.365f, 0.045f)
                lineTo(7.469f, 14.769f)
                arcToRelative(1.527f, 1.527f, 0.0f, false, true, -1.532f, -1.532f)
                verticalLineToRelative(-2.476f)
                curveToRelative(0.0f, -0.849f, 0.683f, -1.532f, 1.532f, -1.532f)
                horizontalLineToRelative(2.383f)
                curveToRelative(0.126f, 0.0f, 0.248f, 0.017f, 0.365f, 0.045f)
                lineToRelative(-0.002f, -0.046f)
                lineTo(10.215f, 6.754f)
                curveToRelative(0.0f, -0.849f, 0.684f, -1.531f, 1.533f, -1.531f)
                close()
            }
        }
        .build()
        return _cloudron!!
    }

private var _cloudron: ImageVector? = null
