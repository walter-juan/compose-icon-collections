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

public val OutlineGroup.AtSymbol: ImageVector
    get() {
        if (_atSymbol != null) {
            return _atSymbol!!
        }
        _atSymbol = Builder(name = "AtSymbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 14.485f, 14.485f, 16.5f, 12.0f, 16.5f)
                curveTo(9.515f, 16.5f, 7.5f, 14.485f, 7.5f, 12.0f)
                curveTo(7.5f, 9.515f, 9.515f, 7.5f, 12.0f, 7.5f)
                curveTo(14.485f, 7.5f, 16.5f, 9.515f, 16.5f, 12.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 13.657f, 17.507f, 15.0f, 18.75f, 15.0f)
                curveTo(19.993f, 15.0f, 21.0f, 13.657f, 21.0f, 12.0f)
                curveTo(21.0f, 9.697f, 20.121f, 7.393f, 18.364f, 5.636f)
                curveTo(14.849f, 2.121f, 9.151f, 2.121f, 5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                curveTo(9.151f, 21.879f, 14.849f, 21.879f, 18.364f, 18.364f)
                moveTo(16.5f, 12.0f)
                verticalLineTo(8.25f)
            }
        }
        .build()
        return _atSymbol!!
    }

private var _atSymbol: ImageVector? = null
