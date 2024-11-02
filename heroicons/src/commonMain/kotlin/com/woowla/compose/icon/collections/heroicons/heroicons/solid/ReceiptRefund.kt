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

public val SolidGroup.ReceiptRefund: ImageVector
    get() {
        if (_receiptRefund != null) {
            return _receiptRefund!!
        }
        _receiptRefund = Builder(name = "ReceiptRefund", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.03f, 8.03f)
                curveTo(11.323f, 7.737f, 11.323f, 7.263f, 11.03f, 6.97f)
                curveTo(10.737f, 6.677f, 10.263f, 6.677f, 9.97f, 6.97f)
                lineTo(7.72f, 9.22f)
                curveTo(7.427f, 9.513f, 7.427f, 9.987f, 7.72f, 10.28f)
                lineTo(9.97f, 12.53f)
                curveTo(10.263f, 12.823f, 10.737f, 12.823f, 11.03f, 12.53f)
                curveTo(11.323f, 12.237f, 11.323f, 11.763f, 11.03f, 11.47f)
                lineTo(10.061f, 10.5f)
                horizontalLineTo(13.125f)
                curveTo(14.16f, 10.5f, 15.0f, 11.34f, 15.0f, 12.375f)
                curveTo(15.0f, 13.41f, 14.16f, 14.25f, 13.125f, 14.25f)
                horizontalLineTo(12.0f)
                curveTo(11.586f, 14.25f, 11.25f, 14.586f, 11.25f, 15.0f)
                curveTo(11.25f, 15.414f, 11.586f, 15.75f, 12.0f, 15.75f)
                horizontalLineTo(13.125f)
                curveTo(14.989f, 15.75f, 16.5f, 14.239f, 16.5f, 12.375f)
                curveTo(16.5f, 10.511f, 14.989f, 9.0f, 13.125f, 9.0f)
                horizontalLineTo(10.061f)
                lineTo(11.03f, 8.03f)
                close()
            }
        }
        .build()
        return _receiptRefund!!
    }

private var _receiptRefund: ImageVector? = null
