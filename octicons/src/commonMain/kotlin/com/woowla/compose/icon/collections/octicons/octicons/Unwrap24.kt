package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Unwrap24: ImageVector
    get() {
        if (_unwrap24 != null) {
            return _unwrap24!!
        }
        _unwrap24 = Builder(name = "Unwrap24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 5.25f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                curveToRelative(0.14f, 0.141f, 0.331f, 0.22f, 0.53f, 0.22f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, -0.079f, 0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                lineTo(3.75f, 5.25f)
                close()
                moveTo(3.75f, 11.25f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                curveToRelative(0.14f, 0.141f, 0.331f, 0.22f, 0.53f, 0.22f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, -0.079f, 0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                lineTo(3.75f, 11.25f)
                close()
                moveTo(3.75f, 17.25f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                curveToRelative(0.14f, 0.141f, 0.331f, 0.22f, 0.53f, 0.22f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, -0.079f, 0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, -0.22f)
                horizontalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _unwrap24!!
    }

private var _unwrap24: ImageVector? = null
