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

public val Octicons.Unwrap16: ImageVector
    get() {
        if (_unwrap16 != null) {
            return _unwrap16!!
        }
        _unwrap16 = Builder(name = "Unwrap16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.75f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.39f, 0.22f, -0.53f)
                arcTo(0.747f, 0.747f, 0.0f, false, true, 1.75f, 2.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(1.75f, 3.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.22f, -0.53f)
                close()
                moveTo(1.0f, 7.75f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.39f, 0.22f, -0.53f)
                arcTo(0.747f, 0.747f, 0.0f, false, true, 1.75f, 7.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(1.75f, 8.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.22f, -0.53f)
                close()
                moveTo(1.75f, 12.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                close()
            }
        }
        .build()
        return _unwrap16!!
    }

private var _unwrap16: ImageVector? = null
