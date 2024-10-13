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

public val SolidGroup.BxsCake: ImageVector
    get() {
        if (_bxsCake != null) {
            return _bxsCake!!
        }
        _bxsCake = Builder(name = "BxsCake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.997f, 15.0f)
                curveToRelative(-1.601f, 0.0f, -2.446f, -0.676f, -3.125f, -1.219f)
                curveToRelative(-0.567f, -0.453f, -0.977f, -0.781f, -1.878f, -0.781f)
                curveToRelative(-0.898f, 0.0f, -1.287f, 0.311f, -1.874f, 0.78f)
                curveToRelative(-0.679f, 0.544f, -1.524f, 1.22f, -3.125f, 1.22f)
                reflectiveCurveToRelative(-2.444f, -0.676f, -3.123f, -1.22f)
                curveTo(3.285f, 13.311f, 2.897f, 13.0f, 2.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(-0.899f, 0.0f, -1.288f, 0.311f, -1.876f, 0.781f)
                curveToRelative(-0.68f, 0.543f, -1.525f, 1.219f, -3.127f, 1.219f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.346f, 5.0f, 2.0f, 6.346f, 2.0f, 8.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.6f, 0.0f, 2.443f, 0.676f, 3.122f, 1.22f)
                curveToRelative(0.587f, 0.469f, 0.975f, 0.78f, 1.873f, 0.78f)
                curveToRelative(0.899f, 0.0f, 1.287f, -0.311f, 1.875f, -0.781f)
                curveToRelative(0.679f, -0.543f, 1.524f, -1.219f, 3.124f, -1.219f)
                curveToRelative(1.602f, 0.0f, 2.447f, 0.676f, 3.127f, 1.219f)
                curveToRelative(0.588f, 0.47f, 0.977f, 0.781f, 1.876f, 0.781f)
                curveToRelative(0.9f, 0.0f, 1.311f, -0.328f, 1.878f, -0.781f)
                curveTo(19.554f, 11.676f, 20.399f, 11.0f, 22.0f, 11.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bxsCake!!
    }

private var _bxsCake: ImageVector? = null
