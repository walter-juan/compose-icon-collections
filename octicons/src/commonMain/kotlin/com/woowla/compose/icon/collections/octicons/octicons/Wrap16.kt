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

public val Octicons.Wrap16: ImageVector
    get() {
        if (_wrap16 != null) {
            return _wrap16!!
        }
        _wrap16 = Builder(name = "Wrap16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 7.0f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, -0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.0f, 1.06f)
                curveToRelative(0.14f, 0.141f, 0.331f, 0.22f, 0.53f, 0.22f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.464f, 0.0f, 0.909f, 0.184f, 1.237f, 0.513f)
                arcToRelative(1.746f, 1.746f, 0.0f, false, true, 0.0f, 2.474f)
                arcTo(1.746f, 1.746f, 0.0f, false, true, 11.75f, 12.0f)
                horizontalLineToRelative(-1.464f)
                verticalLineToRelative(-0.464f)
                arcToRelative(0.675f, 0.675f, 0.0f, false, false, -0.375f, -0.607f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, -0.711f, 0.064f)
                lineToRelative(-1.619f, 1.214f)
                arcToRelative(0.679f, 0.679f, 0.0f, false, false, 0.0f, 1.086f)
                lineTo(9.2f, 14.507f)
                arcToRelative(0.683f, 0.683f, 0.0f, false, false, 0.711f, 0.064f)
                arcToRelative(0.685f, 0.685f, 0.0f, false, false, 0.375f, -0.607f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(1.464f)
                arcTo(3.247f, 3.247f, 0.0f, false, false, 15.0f, 10.25f)
                arcTo(3.247f, 3.247f, 0.0f, false, false, 11.75f, 7.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(1.0f, 2.75f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.39f, 0.22f, -0.53f)
                arcTo(0.747f, 0.747f, 0.0f, false, true, 1.75f, 2.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.199f, 0.0f, 0.39f, 0.079f, 0.53f, 0.22f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.0f, 1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineTo(1.75f)
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
        return _wrap16!!
    }

private var _wrap16: ImageVector? = null
