package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ReceiptPercent: ImageVector
    get() {
        if (_receiptPercent != null) {
            return _receiptPercent!!
        }
        _receiptPercent = Builder(name = "ReceiptPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.5f)
                curveTo(10.079f, 1.5f, 8.184f, 1.611f, 6.32f, 1.827f)
                curveTo(4.823f, 2.001f, 3.75f, 3.287f, 3.75f, 4.757f)
                verticalLineTo(21.75f)
                curveTo(3.75f, 21.999f, 3.873f, 22.232f, 4.08f, 22.371f)
                curveTo(4.286f, 22.511f, 4.547f, 22.539f, 4.779f, 22.446f)
                lineTo(8.25f, 21.058f)
                lineTo(11.722f, 22.446f)
                curveTo(11.9f, 22.518f, 12.1f, 22.518f, 12.278f, 22.446f)
                lineTo(15.75f, 21.058f)
                lineTo(19.222f, 22.446f)
                curveTo(19.452f, 22.539f, 19.714f, 22.511f, 19.92f, 22.371f)
                curveTo(20.127f, 22.232f, 20.25f, 21.999f, 20.25f, 21.75f)
                verticalLineTo(4.757f)
                curveTo(20.25f, 3.287f, 19.177f, 2.001f, 17.68f, 1.827f)
                curveTo(15.816f, 1.611f, 13.921f, 1.5f, 12.0f, 1.5f)
                close()
                moveTo(15.53f, 8.78f)
                curveTo(15.823f, 8.487f, 15.823f, 8.013f, 15.53f, 7.72f)
                curveTo(15.237f, 7.427f, 14.763f, 7.427f, 14.47f, 7.72f)
                lineTo(8.47f, 13.72f)
                curveTo(8.177f, 14.013f, 8.177f, 14.487f, 8.47f, 14.78f)
                curveTo(8.763f, 15.073f, 9.237f, 15.073f, 9.53f, 14.78f)
                lineTo(15.53f, 8.78f)
                close()
                moveTo(8.625f, 9.0f)
                curveTo(8.625f, 8.379f, 9.129f, 7.875f, 9.75f, 7.875f)
                curveTo(10.371f, 7.875f, 10.875f, 8.379f, 10.875f, 9.0f)
                curveTo(10.875f, 9.621f, 10.371f, 10.125f, 9.75f, 10.125f)
                curveTo(9.129f, 10.125f, 8.625f, 9.621f, 8.625f, 9.0f)
                close()
                moveTo(14.25f, 12.375f)
                curveTo(13.629f, 12.375f, 13.125f, 12.879f, 13.125f, 13.5f)
                curveTo(13.125f, 14.121f, 13.629f, 14.625f, 14.25f, 14.625f)
                curveTo(14.871f, 14.625f, 15.375f, 14.121f, 15.375f, 13.5f)
                curveTo(15.375f, 12.879f, 14.871f, 12.375f, 14.25f, 12.375f)
                close()
            }
        }
        .build()
        return _receiptPercent!!
    }

private var _receiptPercent: ImageVector? = null
