package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.BusWifiFill: ImageVector
    get() {
        if (_busWifiFill != null) {
            return _busWifiFill!!
        }
        _busWifiFill = Builder(name = "BusWifiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(17.448f, 22.0f, 17.0f, 21.552f, 17.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                curveTo(7.0f, 21.552f, 6.552f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(18.5f, 1.0f)
                curveTo(20.985f, 1.0f, 23.0f, 3.015f, 23.0f, 5.5f)
                curveTo(23.0f, 7.985f, 20.985f, 10.0f, 18.5f, 10.0f)
                curveTo(16.015f, 10.0f, 14.0f, 7.985f, 14.0f, 5.5f)
                curveTo(14.0f, 3.015f, 16.015f, 1.0f, 18.5f, 1.0f)
                close()
                moveTo(18.5f, 6.167f)
                curveTo(18.009f, 6.167f, 17.559f, 6.344f, 17.211f, 6.637f)
                lineTo(17.086f, 6.752f)
                lineTo(18.5f, 8.167f)
                lineTo(19.913f, 6.752f)
                curveTo(19.551f, 6.39f, 19.052f, 6.167f, 18.5f, 6.167f)
                close()
                moveTo(18.5f, 3.5f)
                curveTo(17.297f, 3.5f, 16.2f, 3.955f, 15.372f, 4.703f)
                lineTo(15.199f, 4.868f)
                lineTo(16.143f, 5.81f)
                curveTo(16.746f, 5.206f, 17.579f, 4.833f, 18.5f, 4.833f)
                curveTo(19.344f, 4.833f, 20.114f, 5.147f, 20.701f, 5.664f)
                lineTo(20.857f, 5.81f)
                lineTo(21.8f, 4.867f)
                curveTo(20.955f, 4.022f, 19.788f, 3.5f, 18.5f, 3.5f)
                close()
            }
        }
        .build()
        return _busWifiFill!!
    }

private var _busWifiFill: ImageVector? = null
