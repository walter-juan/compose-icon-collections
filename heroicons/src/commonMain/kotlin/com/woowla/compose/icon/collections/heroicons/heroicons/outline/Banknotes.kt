package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Banknotes: ImageVector
    get() {
        if (_banknotes != null) {
            return _banknotes!!
        }
        _banknotes = Builder(name = "Banknotes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 18.75f)
                curveTo(7.717f, 18.75f, 13.014f, 19.481f, 18.047f, 20.851f)
                curveTo(18.774f, 21.049f, 19.5f, 20.509f, 19.5f, 19.755f)
                verticalLineTo(18.75f)
                moveTo(3.75f, 4.5f)
                verticalLineTo(5.25f)
                curveTo(3.75f, 5.664f, 3.414f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(2.25f)
                moveTo(2.25f, 6.0f)
                verticalLineTo(5.625f)
                curveTo(2.25f, 5.004f, 2.754f, 4.5f, 3.375f, 4.5f)
                horizontalLineTo(20.25f)
                moveTo(2.25f, 6.0f)
                verticalLineTo(15.0f)
                moveTo(20.25f, 4.5f)
                verticalLineTo(5.25f)
                curveTo(20.25f, 5.664f, 20.586f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(21.75f)
                moveTo(20.25f, 4.5f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 4.5f, 21.75f, 5.004f, 21.75f, 5.625f)
                verticalLineTo(15.375f)
                curveTo(21.75f, 15.996f, 21.246f, 16.5f, 20.625f, 16.5f)
                horizontalLineTo(20.25f)
                moveTo(21.75f, 15.0f)
                horizontalLineTo(21.0f)
                curveTo(20.586f, 15.0f, 20.25f, 15.336f, 20.25f, 15.75f)
                verticalLineTo(16.5f)
                moveTo(20.25f, 16.5f)
                horizontalLineTo(3.75f)
                moveTo(3.75f, 16.5f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 16.5f, 2.25f, 15.996f, 2.25f, 15.375f)
                verticalLineTo(15.0f)
                moveTo(3.75f, 16.5f)
                verticalLineTo(15.75f)
                curveTo(3.75f, 15.336f, 3.414f, 15.0f, 3.0f, 15.0f)
                horizontalLineTo(2.25f)
                moveTo(15.0f, 10.5f)
                curveTo(15.0f, 12.157f, 13.657f, 13.5f, 12.0f, 13.5f)
                curveTo(10.343f, 13.5f, 9.0f, 12.157f, 9.0f, 10.5f)
                curveTo(9.0f, 8.843f, 10.343f, 7.5f, 12.0f, 7.5f)
                curveTo(13.657f, 7.5f, 15.0f, 8.843f, 15.0f, 10.5f)
                close()
                moveTo(18.0f, 10.5f)
                horizontalLineTo(18.007f)
                verticalLineTo(10.507f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(6.0f, 10.5f)
                horizontalLineTo(6.008f)
                verticalLineTo(10.507f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _banknotes!!
    }

private var _banknotes: ImageVector? = null
