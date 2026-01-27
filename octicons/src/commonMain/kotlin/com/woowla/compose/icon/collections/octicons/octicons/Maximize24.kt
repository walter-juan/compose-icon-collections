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

public val Octicons.Maximize24: ImageVector
    get() {
        if (_maximize24 != null) {
            return _maximize24!!
        }
        _maximize24 = Builder(name = "Maximize24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.47f, 13.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-5.719f, 5.72f)
                horizontalLineTo(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(3.0f)
                arcToRelative(0.731f, 0.731f, 0.0f, false, true, -0.133f, -0.013f)
                lineToRelative(-0.016f, -0.003f)
                curveToRelative(-0.014f, -0.002f, -0.026f, -0.008f, -0.039f, -0.011f)
                curveToRelative(-0.034f, -0.009f, -0.067f, -0.017f, -0.099f, -0.031f)
                arcToRelative(0.659f, 0.659f, 0.0f, false, true, -0.083f, -0.044f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, true, -0.279f, -0.279f)
                arcTo(0.713f, 0.713f, 0.0f, false, true, 2.25f, 21.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.189f)
                lineToRelative(5.72f, -5.719f)
                close()
                moveTo(21.0f, 2.25f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.132f, 0.012f)
                lineToRelative(0.016f, 0.003f)
                curveToRelative(0.014f, 0.002f, 0.026f, 0.008f, 0.04f, 0.011f)
                curveToRelative(0.033f, 0.009f, 0.066f, 0.017f, 0.098f, 0.031f)
                arcToRelative(0.659f, 0.659f, 0.0f, false, true, 0.083f, 0.044f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, true, 0.279f, 0.279f)
                arcToRelative(0.659f, 0.659f, 0.0f, false, true, 0.102f, 0.37f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(4.811f)
                lineToRelative(-5.72f, 5.719f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(5.719f, -5.72f)
                horizontalLineTo(15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _maximize24!!
    }

private var _maximize24: ImageVector? = null
