package com.woowla.compose.icon.collections.heroicons.heroicons.outline

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
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.5f)
                curveTo(15.0f, 12.157f, 13.657f, 13.5f, 12.0f, 13.5f)
                curveTo(10.343f, 13.5f, 9.0f, 12.157f, 9.0f, 10.5f)
                curveTo(9.0f, 8.843f, 10.343f, 7.5f, 12.0f, 7.5f)
                curveTo(13.657f, 7.5f, 15.0f, 8.843f, 15.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 10.5f)
                curveTo(19.5f, 17.642f, 12.0f, 21.75f, 12.0f, 21.75f)
                curveTo(12.0f, 21.75f, 4.5f, 17.642f, 4.5f, 10.5f)
                curveTo(4.5f, 6.358f, 7.858f, 3.0f, 12.0f, 3.0f)
                curveTo(16.142f, 3.0f, 19.5f, 6.358f, 19.5f, 10.5f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
