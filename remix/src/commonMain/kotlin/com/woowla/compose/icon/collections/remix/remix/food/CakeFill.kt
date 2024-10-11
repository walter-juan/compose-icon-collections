package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.CakeFill: ImageVector
    get() {
        if (_cakeFill != null) {
            return _cakeFill!!
        }
        _cakeFill = Builder(name = "CakeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                verticalLineTo(11.0f)
                lineTo(20.0f, 11.0f)
                curveTo(20.552f, 11.0f, 21.0f, 11.448f, 21.0f, 12.0f)
                verticalLineTo(20.0f)
                lineTo(23.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 11.448f, 3.448f, 11.0f, 4.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.83f, 0.402f)
                curveTo(14.659f, 1.837f, 14.167f, 3.671f, 12.732f, 4.5f)
                lineTo(11.0f, 5.5f)
                curveTo(10.172f, 4.065f, 10.663f, 2.23f, 12.098f, 1.402f)
                lineTo(13.83f, 0.402f)
                close()
            }
        }
        .build()
        return _cakeFill!!
    }

private var _cakeFill: ImageVector? = null
