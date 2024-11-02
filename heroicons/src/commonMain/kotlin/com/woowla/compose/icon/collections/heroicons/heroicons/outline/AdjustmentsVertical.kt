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

public val OutlineGroup.AdjustmentsVertical: ImageVector
    get() {
        if (_adjustmentsVertical != null) {
            return _adjustmentsVertical!!
        }
        _adjustmentsVertical = Builder(name = "AdjustmentsVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.5f)
                lineTo(6.0f, 3.75f)
                moveTo(6.0f, 13.5f)
                curveTo(6.828f, 13.5f, 7.5f, 14.172f, 7.5f, 15.0f)
                curveTo(7.5f, 15.828f, 6.828f, 16.5f, 6.0f, 16.5f)
                moveTo(6.0f, 13.5f)
                curveTo(5.172f, 13.5f, 4.5f, 14.172f, 4.5f, 15.0f)
                curveTo(4.5f, 15.828f, 5.172f, 16.5f, 6.0f, 16.5f)
                moveTo(6.0f, 20.25f)
                lineTo(6.0f, 16.5f)
                moveTo(18.0f, 13.5f)
                verticalLineTo(3.75f)
                moveTo(18.0f, 13.5f)
                curveTo(18.828f, 13.5f, 19.5f, 14.172f, 19.5f, 15.0f)
                curveTo(19.5f, 15.828f, 18.828f, 16.5f, 18.0f, 16.5f)
                moveTo(18.0f, 13.5f)
                curveTo(17.172f, 13.5f, 16.5f, 14.172f, 16.5f, 15.0f)
                curveTo(16.5f, 15.828f, 17.172f, 16.5f, 18.0f, 16.5f)
                moveTo(18.0f, 20.25f)
                lineTo(18.0f, 16.5f)
                moveTo(12.0f, 7.5f)
                verticalLineTo(3.75f)
                moveTo(12.0f, 7.5f)
                curveTo(12.828f, 7.5f, 13.5f, 8.172f, 13.5f, 9.0f)
                curveTo(13.5f, 9.828f, 12.828f, 10.5f, 12.0f, 10.5f)
                moveTo(12.0f, 7.5f)
                curveTo(11.172f, 7.5f, 10.5f, 8.172f, 10.5f, 9.0f)
                curveTo(10.5f, 9.828f, 11.172f, 10.5f, 12.0f, 10.5f)
                moveTo(12.0f, 20.25f)
                verticalLineTo(10.5f)
            }
        }
        .build()
        return _adjustmentsVertical!!
    }

private var _adjustmentsVertical: ImageVector? = null
