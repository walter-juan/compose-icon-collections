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

public val OutlineGroup.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) {
            return _cubeTransparent!!
        }
        _cubeTransparent = Builder(name = "CubeTransparent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.5f)
                lineTo(18.75f, 6.188f)
                moveTo(21.0f, 7.5f)
                verticalLineTo(9.75f)
                moveTo(21.0f, 7.5f)
                lineTo(18.75f, 8.813f)
                moveTo(3.0f, 7.5f)
                lineTo(5.25f, 6.188f)
                moveTo(3.0f, 7.5f)
                lineTo(5.25f, 8.813f)
                moveTo(3.0f, 7.5f)
                verticalLineTo(9.75f)
                moveTo(12.0f, 12.75f)
                lineTo(14.25f, 11.438f)
                moveTo(12.0f, 12.75f)
                lineTo(9.75f, 11.438f)
                moveTo(12.0f, 12.75f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 21.75f)
                lineTo(14.25f, 20.438f)
                moveTo(12.0f, 21.75f)
                verticalLineTo(19.5f)
                moveTo(12.0f, 21.75f)
                lineTo(9.75f, 20.438f)
                moveTo(9.75f, 3.563f)
                lineTo(12.0f, 2.25f)
                lineTo(14.25f, 3.563f)
                moveTo(21.0f, 14.25f)
                verticalLineTo(16.5f)
                lineTo(18.75f, 17.813f)
                moveTo(5.25f, 17.813f)
                lineTo(3.0f, 16.5f)
                verticalLineTo(14.25f)
            }
        }
        .build()
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
