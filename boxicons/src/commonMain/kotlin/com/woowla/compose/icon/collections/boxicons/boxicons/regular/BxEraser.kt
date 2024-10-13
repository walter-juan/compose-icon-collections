package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxEraser: ImageVector
    get() {
        if (_bxEraser != null) {
            return _bxEraser!!
        }
        _bxEraser = Builder(name = "BxEraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.586f, 15.408f)
                lineToRelative(4.299f, 4.299f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(12.001f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.958f)
                lineToRelative(7.222f, -7.222f)
                curveToRelative(0.78f, -0.779f, 0.78f, -2.049f, 0.0f, -2.828f)
                lineTo(14.906f, 3.0f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, -2.828f, 0.0f)
                lineToRelative(-4.75f, 4.749f)
                lineToRelative(-4.754f, 4.843f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, 0.012f, 2.816f)
                close()
                moveTo(13.492f, 4.414f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-2.586f, 2.586f)
                lineTo(10.906f, 7.0f)
                lineToRelative(2.586f, -2.586f)
                close()
                moveTo(8.749f, 9.156f)
                lineToRelative(0.743f, -0.742f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-4.557f, 4.557f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, false, -0.069f, 0.079f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(-4.005f, -4.007f)
                lineToRelative(4.748f, -4.837f)
                close()
            }
        }
        .build()
        return _bxEraser!!
    }

private var _bxEraser: ImageVector? = null
