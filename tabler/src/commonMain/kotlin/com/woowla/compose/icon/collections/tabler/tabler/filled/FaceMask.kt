package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.825f, 4.196f)
                lineToRelative(5.0f, 1.43f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.175f, 2.884f)
                verticalLineToRelative(0.065f)
                curveToRelative(1.7f, 0.33f, 3.0f, 1.72f, 3.0f, 3.425f)
                reflectiveCurveToRelative(-1.3f, 3.095f, -3.0f, 3.425f)
                verticalLineToRelative(0.066f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.175f, 2.885f)
                lineToRelative(-5.0f, 1.428f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.65f, 0.0f)
                lineToRelative(-5.0f, -1.429f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.17f, -2.702f)
                lineToRelative(-0.005f, -0.247f)
                curveToRelative(-1.7f, -0.33f, -3.0f, -1.72f, -3.0f, -3.426f)
                curveToRelative(0.0f, -1.705f, 1.3f, -3.096f, 3.0f, -3.426f)
                verticalLineToRelative(-0.064f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.175f, -2.884f)
                lineToRelative(5.0f, -1.428f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.65f, 0.0f)
                moveToRelative(2.175f, 8.802f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-11.0f, -2.349f)
                curveToRelative(-0.6f, 0.248f, -1.0f, 0.77f, -1.0f, 1.349f)
                curveToRelative(0.0f, 0.578f, 0.4f, 1.101f, 1.0f, 1.349f)
                close()
                moveTo(20.001f, 10.651f)
                verticalLineToRelative(2.697f)
                curveToRelative(0.599f, -0.248f, 0.999f, -0.77f, 0.999f, -1.348f)
                reflectiveCurveToRelative(-0.4f, -1.1f, -0.999f, -1.348f)
                moveToRelative(-5.001f, -1.652f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
