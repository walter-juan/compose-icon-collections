package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.496f, -0.868f)
                lineToRelative(7.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.736f)
                lineToRelative(-6.496f, 3.712f)
                verticalLineToRelative(6.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.135f, 17.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.367f, -0.363f)
                curveToRelative(0.916f, 0.532f, 1.498f, 1.291f, 1.498f, 2.195f)
                curveToRelative(0.0f, 1.84f, -2.319f, 3.0f, -5.0f, 3.0f)
                reflectiveCurveToRelative(-5.0f, -1.16f, -5.0f, -3.0f)
                curveToRelative(0.0f, -0.911f, 0.577f, -1.66f, 1.498f, -2.195f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.004f, 1.73f)
                curveToRelative(-0.365f, 0.212f, -0.502f, 0.39f, -0.502f, 0.465f)
                curveToRelative(0.0f, 0.086f, 0.179f, 0.296f, 0.622f, 0.518f)
                curveToRelative(0.6f, 0.3f, 1.456f, 0.482f, 2.378f, 0.482f)
                reflectiveCurveToRelative(1.777f, -0.182f, 2.378f, -0.482f)
                curveToRelative(0.443f, -0.222f, 0.622f, -0.432f, 0.622f, -0.518f)
                curveToRelative(0.0f, -0.07f, -0.142f, -0.256f, -0.502f, -0.465f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.363f, -1.367f)
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
