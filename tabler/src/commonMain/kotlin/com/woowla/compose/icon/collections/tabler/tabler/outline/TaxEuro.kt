package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.TaxEuro: ImageVector
    get() {
        if (_taxEuro != null) {
            return _taxEuro!!
        }
        _taxEuro = Builder(name = "TaxEuro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.487f, 21.0f)
                horizontalLineToRelative(7.026f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.808f, -5.224f)
                lineToRelative(-1.706f, -5.306f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.76f, -3.47f)
                horizontalLineToRelative(-1.71f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.76f, 3.47f)
                lineToRelative(-1.706f, 5.306f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.808f, 5.224f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                quadToRelative(-1.0f, 4.0f, -3.0f, 4.0f)
                reflectiveQuadToRelative(-3.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 11.172f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 5.656f)
            }
        }
        .build()
        return _taxEuro!!
    }

private var _taxEuro: ImageVector? = null
