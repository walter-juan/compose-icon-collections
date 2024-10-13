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

public val SolidGroup.BxsShip: ImageVector
    get() {
        if (_bxsShip != null) {
            return _bxsShip!!
        }
        _bxsShip = Builder(name = "BxsShip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.997f, 20.0f)
                curveToRelative(-0.899f, 0.0f, -1.288f, -0.311f, -1.876f, -0.781f)
                curveToRelative(-0.68f, -0.543f, -1.525f, -1.219f, -3.127f, -1.219f)
                curveToRelative(-1.601f, 0.0f, -2.446f, 0.676f, -3.125f, 1.22f)
                curveToRelative(-0.587f, 0.469f, -0.975f, 0.78f, -1.874f, 0.78f)
                curveToRelative(-0.897f, 0.0f, -1.285f, -0.311f, -1.872f, -0.78f)
                curveTo(4.444f, 18.676f, 3.601f, 18.0f, 2.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.898f, 0.0f, 1.286f, 0.311f, 1.873f, 0.78f)
                curveToRelative(0.679f, 0.544f, 1.523f, 1.22f, 3.122f, 1.22f)
                curveToRelative(1.601f, 0.0f, 2.445f, -0.676f, 3.124f, -1.219f)
                curveToRelative(0.588f, -0.47f, 0.976f, -0.781f, 1.875f, -0.781f)
                curveToRelative(0.9f, 0.0f, 1.311f, 0.328f, 1.878f, 0.781f)
                curveToRelative(0.679f, 0.543f, 1.524f, 1.219f, 3.125f, 1.219f)
                reflectiveCurveToRelative(2.446f, -0.676f, 3.125f, -1.219f)
                curveTo(20.689f, 20.328f, 21.1f, 20.0f, 22.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.602f, 0.0f, -2.447f, 0.676f, -3.127f, 1.219f)
                curveToRelative(-0.588f, 0.47f, -0.977f, 0.781f, -1.876f, 0.781f)
                close()
                moveTo(6.0f, 8.5f)
                lineTo(4.0f, 9.0f)
                lineToRelative(2.0f, 8.0f)
                horizontalLineToRelative(0.995f)
                curveToRelative(1.601f, 0.0f, 2.445f, -0.676f, 3.124f, -1.219f)
                curveToRelative(0.588f, -0.47f, 0.976f, -0.781f, 1.875f, -0.781f)
                curveToRelative(0.9f, 0.0f, 1.311f, 0.328f, 1.878f, 0.781f)
                curveToRelative(0.679f, 0.543f, 1.524f, 1.219f, 3.125f, 1.219f)
                lineTo(18.0f, 17.0f)
                lineToRelative(0.027f, -0.107f)
                lineToRelative(0.313f, -1.252f)
                lineTo(20.0f, 9.0f)
                lineToRelative(-2.0f, -0.5f)
                lineTo(18.0f, 5.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.804f, -0.981f)
                lineTo(13.0f, 3.181f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.181f)
                lineToRelative(-4.196f, 0.839f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.001f)
                lineTo(6.0f, 8.5f)
                close()
                moveTo(8.0f, 5.819f)
                lineTo(12.0f, 5.019f)
                lineTo(16.0f, 5.819f)
                lineTo(16.0f, 8.0f)
                lineToRelative(-4.0f, -1.0f)
                lineToRelative(-4.0f, 1.0f)
                lineTo(8.0f, 5.819f)
                close()
            }
        }
        .build()
        return _bxsShip!!
    }

private var _bxsShip: ImageVector? = null
