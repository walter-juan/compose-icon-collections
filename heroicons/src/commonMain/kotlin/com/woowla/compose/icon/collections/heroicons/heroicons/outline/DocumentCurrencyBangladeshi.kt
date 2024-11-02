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

public val OutlineGroup.DocumentCurrencyBangladeshi: ImageVector
    get() {
        if (_documentCurrencyBangladeshi != null) {
            return _documentCurrencyBangladeshi!!
        }
        _documentCurrencyBangladeshi = Builder(name = "DocumentCurrencyBangladeshi", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(8.25f, 10.5f)
                lineTo(8.47f, 10.28f)
                curveTo(8.942f, 9.808f, 9.75f, 10.142f, 9.75f, 10.811f)
                verticalLineTo(17.251f)
                curveTo(9.75f, 17.723f, 9.964f, 18.185f, 10.39f, 18.388f)
                curveTo(10.878f, 18.62f, 11.424f, 18.75f, 12.0f, 18.75f)
                curveTo(13.492f, 18.75f, 14.78f, 17.879f, 15.384f, 16.618f)
                curveTo(15.589f, 16.19f, 15.232f, 15.75f, 14.757f, 15.75f)
                horizontalLineTo(14.25f)
                moveTo(8.25f, 13.5f)
                horizontalLineTo(15.75f)
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
        return _documentCurrencyBangladeshi!!
    }

private var _documentCurrencyBangladeshi: ImageVector? = null
