package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.HandbagFill: ImageVector
    get() {
        if (_handbagFill != null) {
            return _handbagFill!!
        }
        _handbagFill = Builder(name = "HandbagFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                horizontalLineTo(20.074f)
                curveTo(20.597f, 9.0f, 21.031f, 9.402f, 21.071f, 9.923f)
                lineTo(21.917f, 20.923f)
                curveTo(21.96f, 21.474f, 21.548f, 21.955f, 20.997f, 21.997f)
                lineTo(20.92f, 22.0f)
                horizontalLineTo(3.08f)
                curveTo(2.528f, 22.0f, 2.08f, 21.552f, 2.08f, 21.0f)
                lineTo(2.083f, 20.923f)
                lineTo(2.929f, 9.923f)
                curveTo(2.969f, 9.402f, 3.404f, 9.0f, 3.926f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.311f, 4.0f, 7.118f, 6.122f, 7.005f, 8.783f)
                lineTo(7.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 6.311f, 14.878f, 4.118f, 12.217f, 4.005f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handbagFill!!
    }

private var _handbagFill: ImageVector? = null
