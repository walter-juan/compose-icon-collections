package com.woowla.compose.icon.collections.remix.remix.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FinanceGroup

public val FinanceGroup.JewelryLine: ImageVector
    get() {
        if (_jewelryLine != null) {
            return _jewelryLine!!
        }
        _jewelryLine = Builder(name = "JewelryLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.9f)
                curveTo(9.0f, 2.437f, 9.319f, 2.035f, 9.769f, 1.927f)
                curveTo(11.165f, 1.596f, 12.834f, 1.601f, 14.231f, 1.927f)
                curveTo(14.677f, 2.033f, 15.0f, 2.442f, 15.0f, 2.9f)
                verticalLineTo(5.038f)
                curveTo(15.0f, 5.329f, 15.169f, 5.594f, 15.432f, 5.717f)
                lineTo(21.126f, 8.385f)
                curveTo(21.871f, 8.734f, 22.196f, 9.618f, 21.854f, 10.367f)
                lineTo(17.381f, 20.152f)
                curveTo(17.144f, 20.669f, 16.628f, 21.0f, 16.06f, 21.0f)
                horizontalLineTo(7.941f)
                curveTo(7.373f, 21.0f, 6.856f, 20.669f, 6.62f, 20.152f)
                lineTo(2.147f, 10.367f)
                curveTo(1.805f, 9.618f, 2.129f, 8.734f, 2.875f, 8.385f)
                lineTo(8.569f, 5.717f)
                curveTo(8.832f, 5.594f, 9.0f, 5.329f, 9.0f, 5.038f)
                verticalLineTo(2.9f)
                close()
                moveTo(11.0f, 3.78f)
                verticalLineTo(5.038f)
                curveTo(11.0f, 6.105f, 10.383f, 7.075f, 9.417f, 7.528f)
                lineTo(8.436f, 7.987f)
                curveTo(9.142f, 9.889f, 10.57f, 11.0f, 12.0f, 11.0f)
                curveTo(13.43f, 11.0f, 14.859f, 9.889f, 15.564f, 7.987f)
                lineTo(14.584f, 7.528f)
                curveTo(13.617f, 7.075f, 13.0f, 6.105f, 13.0f, 5.038f)
                verticalLineTo(3.78f)
                curveTo(12.737f, 3.761f, 12.404f, 3.747f, 12.0f, 3.747f)
                curveTo(11.597f, 3.747f, 11.264f, 3.761f, 11.0f, 3.78f)
                close()
                moveTo(11.319f, 12.954f)
                curveTo(9.167f, 12.658f, 7.475f, 10.979f, 6.623f, 8.837f)
                lineTo(4.172f, 9.985f)
                lineTo(8.293f, 19.0f)
                horizontalLineTo(15.708f)
                lineTo(19.829f, 9.985f)
                lineTo(17.378f, 8.837f)
                curveTo(16.526f, 10.979f, 14.833f, 12.658f, 12.682f, 12.954f)
                lineTo(14.189f, 15.064f)
                curveTo(14.375f, 15.325f, 14.375f, 15.675f, 14.189f, 15.936f)
                lineTo(12.204f, 18.715f)
                curveTo(12.104f, 18.855f, 11.897f, 18.855f, 11.797f, 18.715f)
                lineTo(9.812f, 15.936f)
                curveTo(9.625f, 15.675f, 9.625f, 15.325f, 9.812f, 15.064f)
                lineTo(11.319f, 12.954f)
                close()
            }
        }
        .build()
        return _jewelryLine!!
    }

private var _jewelryLine: ImageVector? = null
