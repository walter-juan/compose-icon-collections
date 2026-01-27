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

public val Octicons.Wrap24: ImageVector
    get() {
        if (_wrap24 != null) {
            return _wrap24!!
        }
        _wrap24 = Builder(name = "Wrap24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.25f)
                curveToRelative(1.114f, 0.0f, 2.173f, 0.277f, 2.969f, 0.914f)
                curveToRelative(0.818f, 0.655f, 1.281f, 1.629f, 1.281f, 2.836f)
                curveToRelative(0.0f, 1.207f, -0.463f, 2.181f, -1.281f, 2.836f)
                curveToRelative(-0.796f, 0.637f, -1.855f, 0.914f, -2.969f, 0.914f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.982f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.75f, 0.433f)
                lineToRelative(-3.0f, -1.732f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.866f)
                lineToRelative(3.0f, -1.732f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.75f, 0.433f)
                verticalLineToRelative(0.982f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.886f, 0.0f, 1.577f, -0.223f, 2.031f, -0.586f)
                curveToRelative(0.432f, -0.345f, 0.719f, -0.871f, 0.719f, -1.664f)
                curveToRelative(0.0f, -0.793f, -0.287f, -1.319f, -0.719f, -1.664f)
                curveToRelative(-0.454f, -0.363f, -1.145f, -0.586f, -2.031f, -0.586f)
                lineTo(3.82f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(17.0f, 11.25f)
                close()
                moveTo(9.25f, 17.25f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(20.25f, 5.25f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(3.75f, 6.75f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, -0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(16.5f)
                close()
            }
        }
        .build()
        return _wrap24!!
    }

private var _wrap24: ImageVector? = null
