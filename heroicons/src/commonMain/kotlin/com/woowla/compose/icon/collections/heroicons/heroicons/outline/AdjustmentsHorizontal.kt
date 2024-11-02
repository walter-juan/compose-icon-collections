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

public val OutlineGroup.AdjustmentsHorizontal: ImageVector
    get() {
        if (_adjustmentsHorizontal != null) {
            return _adjustmentsHorizontal!!
        }
        _adjustmentsHorizontal = Builder(name = "AdjustmentsHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 6.0f)
                lineTo(20.25f, 6.0f)
                moveTo(10.5f, 6.0f)
                curveTo(10.5f, 6.828f, 9.828f, 7.5f, 9.0f, 7.5f)
                curveTo(8.172f, 7.5f, 7.5f, 6.828f, 7.5f, 6.0f)
                moveTo(10.5f, 6.0f)
                curveTo(10.5f, 5.172f, 9.828f, 4.5f, 9.0f, 4.5f)
                curveTo(8.172f, 4.5f, 7.5f, 5.172f, 7.5f, 6.0f)
                moveTo(3.75f, 6.0f)
                horizontalLineTo(7.5f)
                moveTo(10.5f, 18.0f)
                horizontalLineTo(20.25f)
                moveTo(10.5f, 18.0f)
                curveTo(10.5f, 18.828f, 9.828f, 19.5f, 9.0f, 19.5f)
                curveTo(8.172f, 19.5f, 7.5f, 18.828f, 7.5f, 18.0f)
                moveTo(10.5f, 18.0f)
                curveTo(10.5f, 17.172f, 9.828f, 16.5f, 9.0f, 16.5f)
                curveTo(8.172f, 16.5f, 7.5f, 17.172f, 7.5f, 18.0f)
                moveTo(3.75f, 18.0f)
                lineTo(7.5f, 18.0f)
                moveTo(16.5f, 12.0f)
                lineTo(20.25f, 12.0f)
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 12.828f, 15.828f, 13.5f, 15.0f, 13.5f)
                curveTo(14.172f, 13.5f, 13.5f, 12.828f, 13.5f, 12.0f)
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 11.172f, 15.828f, 10.5f, 15.0f, 10.5f)
                curveTo(14.172f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                moveTo(3.75f, 12.0f)
                horizontalLineTo(13.5f)
            }
        }
        .build()
        return _adjustmentsHorizontal!!
    }

private var _adjustmentsHorizontal: ImageVector? = null
