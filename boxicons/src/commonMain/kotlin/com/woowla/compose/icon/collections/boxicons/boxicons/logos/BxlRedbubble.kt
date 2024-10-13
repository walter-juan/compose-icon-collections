package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlRedbubble: ImageVector
    get() {
        if (_bxlRedbubble != null) {
            return _bxlRedbubble!!
        }
        _bxlRedbubble = Builder(name = "BxlRedbubble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 2.005f)
                lineTo(12.0f, 2.004f)
                curveToRelative(-5.52f, 0.0f, -9.996f, 4.475f, -9.996f, 9.995f)
                curveToRelative(0.0f, 5.521f, 4.477f, 9.998f, 9.996f, 9.998f)
                curveToRelative(5.521f, 0.0f, 9.996f, -4.475f, 9.996f, -9.997f)
                curveToRelative(0.0f, -5.52f, -4.475f, -9.995f, -9.994f, -9.995f)
                close()
                moveTo(12.164f, 15.535f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, -0.174f, 0.066f)
                verticalLineToRelative(0.001f)
                lineTo(6.455f, 15.602f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, true, -0.266f, -0.268f)
                lineTo(6.189f, 8.646f)
                curveToRelative(0.0f, -0.148f, 0.119f, -0.268f, 0.266f, -0.268f)
                horizontalLineToRelative(2.589f)
                curveToRelative(1.612f, 0.0f, 2.576f, 0.87f, 2.576f, 2.327f)
                curveToRelative(0.0f, 0.969f, -0.486f, 1.729f, -1.272f, 2.039f)
                lineToRelative(1.842f, 2.413f)
                arcToRelative(0.269f, 0.269f, 0.0f, false, true, -0.026f, 0.378f)
                close()
                moveTo(15.859f, 15.603f)
                horizontalLineToRelative(-2.665f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, true, -0.266f, -0.269f)
                lineTo(12.928f, 8.646f)
                curveToRelative(0.0f, -0.148f, 0.119f, -0.267f, 0.266f, -0.267f)
                horizontalLineToRelative(2.472f)
                curveToRelative(1.853f, 0.0f, 2.242f, 1.091f, 2.242f, 2.007f)
                curveToRelative(0.0f, 0.529f, -0.141f, 0.949f, -0.421f, 1.258f)
                curveToRelative(0.681f, 0.28f, 1.047f, 0.913f, 1.047f, 1.827f)
                curveToRelative(0.0f, 1.335f, -1.001f, 2.132f, -2.675f, 2.132f)
                close()
            }
        }
        .build()
        return _bxlRedbubble!!
    }

private var _bxlRedbubble: ImageVector? = null
