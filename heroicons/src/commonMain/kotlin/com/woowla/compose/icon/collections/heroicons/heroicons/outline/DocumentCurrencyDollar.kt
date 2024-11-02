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

public val OutlineGroup.DocumentCurrencyDollar: ImageVector
    get() {
        if (_documentCurrencyDollar != null) {
            return _documentCurrencyDollar!!
        }
        _documentCurrencyDollar = Builder(name = "DocumentCurrencyDollar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 14.25f)
                verticalLineTo(11.625f)
                curveTo(19.5f, 9.761f, 17.989f, 8.25f, 16.125f, 8.25f)
                horizontalLineTo(14.625f)
                curveTo(14.004f, 8.25f, 13.5f, 7.746f, 13.5f, 7.125f)
                verticalLineTo(5.625f)
                curveTo(13.5f, 3.761f, 11.989f, 2.25f, 10.125f, 2.25f)
                horizontalLineTo(8.25f)
                moveTo(12.0f, 11.25f)
                verticalLineTo(18.75f)
                moveTo(14.25f, 12.283f)
                curveTo(13.531f, 12.098f, 12.777f, 12.0f, 12.0f, 12.0f)
                curveTo(11.589f, 12.0f, 11.185f, 12.028f, 10.789f, 12.081f)
                curveTo(10.253f, 12.153f, 9.815f, 12.559f, 9.768f, 13.098f)
                curveTo(9.756f, 13.23f, 9.75f, 13.365f, 9.75f, 13.5f)
                curveTo(9.75f, 13.964f, 10.086f, 14.344f, 10.525f, 14.494f)
                lineTo(13.475f, 15.506f)
                curveTo(13.914f, 15.656f, 14.25f, 16.036f, 14.25f, 16.5f)
                curveTo(14.25f, 16.635f, 14.244f, 16.77f, 14.232f, 16.902f)
                curveTo(14.185f, 17.441f, 13.747f, 17.847f, 13.211f, 17.919f)
                curveTo(12.815f, 17.972f, 12.411f, 18.0f, 12.0f, 18.0f)
                curveTo(11.223f, 18.0f, 10.469f, 17.902f, 9.75f, 17.716f)
                moveTo(10.5f, 2.25f)
                horizontalLineTo(5.625f)
                curveTo(5.004f, 2.25f, 4.5f, 2.754f, 4.5f, 3.375f)
                verticalLineTo(20.625f)
                curveTo(4.5f, 21.246f, 5.004f, 21.75f, 5.625f, 21.75f)
                horizontalLineTo(18.375f)
                curveTo(18.996f, 21.75f, 19.5f, 21.246f, 19.5f, 20.625f)
                verticalLineTo(11.25f)
                curveTo(19.5f, 6.279f, 15.471f, 2.25f, 10.5f, 2.25f)
                close()
            }
        }
        .build()
        return _documentCurrencyDollar!!
    }

private var _documentCurrencyDollar: ImageVector? = null
