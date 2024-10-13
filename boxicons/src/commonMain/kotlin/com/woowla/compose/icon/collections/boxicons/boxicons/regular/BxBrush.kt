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

public val RegularGroup.BxBrush: ImageVector
    get() {
        if (_bxBrush != null) {
            return _bxBrush!!
        }
        _bxBrush = Builder(name = "BxBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.707f, 2.293f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-5.84f, 5.84f)
                curveToRelative(-0.015f, -0.001f, -0.029f, -0.009f, -0.044f, -0.009f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.707f, 0.293f)
                lineTo(4.288f, 9.831f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, -0.878f, 2.122f)
                curveToRelative(0.0f, 0.802f, 0.313f, 1.556f, 0.879f, 2.121f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.122f, 2.122f)
                arcTo(2.92f, 2.92f, 0.0f, false, false, 2.0f, 19.012f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, false, 1.063f, 2.308f)
                curveToRelative(0.519f, 0.439f, 1.188f, 0.68f, 1.885f, 0.68f)
                curveToRelative(0.834f, 0.0f, 1.654f, -0.341f, 2.25f, -0.937f)
                lineToRelative(2.04f, -2.039f)
                lineToRelative(0.707f, 0.706f)
                curveToRelative(1.134f, 1.133f, 3.109f, 1.134f, 4.242f, 0.001f)
                lineToRelative(1.415f, -1.414f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.293f, -0.707f)
                curveToRelative(0.0f, -0.026f, -0.013f, -0.05f, -0.015f, -0.076f)
                lineToRelative(5.827f, -5.827f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-8.0f, -8.0f)
                close()
                moveTo(12.772f, 18.317f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, -0.001f)
                lineToRelative(-1.414f, -1.413f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-2.746f, 2.745f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, true, -0.836f, 0.352f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.594f, -0.208f)
                arcTo(0.978f, 0.978f, 0.0f, false, true, 4.0f, 19.01f)
                arcToRelative(0.959f, 0.959f, 0.0f, false, true, 0.287f, -0.692f)
                lineToRelative(2.829f, -2.829f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(5.701f, 12.66f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, -0.292f, -0.706f)
                curveToRelative(0.0f, -0.268f, 0.104f, -0.519f, 0.293f, -0.708f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(7.071f, 7.072f)
                lineToRelative(-0.708f, 0.706f)
                close()
                moveTo(14.661f, 15.925f)
                lineTo(8.075f, 9.339f)
                lineTo(13.0f, 4.414f)
                lineTo(19.586f, 11.0f)
                lineToRelative(-4.925f, 4.925f)
                close()
            }
        }
        .build()
        return _bxBrush!!
    }

private var _bxBrush: ImageVector? = null
