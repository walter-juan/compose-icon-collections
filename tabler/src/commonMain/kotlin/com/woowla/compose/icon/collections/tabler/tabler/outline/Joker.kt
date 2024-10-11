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

public val OutlineGroup.Joker: ImageVector
    get() {
        if (_joker != null) {
            return _joker!!
        }
        _joker = Builder(name = "Joker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                quadToRelative(-2.5f, -8.0f, -6.0f, -8.0f)
                quadToRelative(-2.5f, 0.0f, -3.0f, 2.0f)
                curveToRelative(2.953f, 0.31f, 3.308f, 3.33f, 4.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                quadToRelative(2.5f, -8.0f, 6.0f, -8.0f)
                quadToRelative(2.5f, 0.0f, 3.0f, 2.0f)
                curveToRelative(-2.953f, 0.31f, -3.308f, 3.33f, -4.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.5f)
                quadToRelative(2.0f, -3.5f, 3.0f, -3.5f)
                reflectiveQuadToRelative(3.0f, 3.5f)
            }
        }
        .build()
        return _joker!!
    }

private var _joker: ImageVector? = null
