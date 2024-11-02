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

public val OutlineGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.042f)
                curveTo(10.408f, 4.617f, 8.305f, 3.75f, 6.0f, 3.75f)
                curveTo(4.948f, 3.75f, 3.938f, 3.93f, 3.0f, 4.262f)
                verticalLineTo(18.512f)
                curveTo(3.938f, 18.181f, 4.948f, 18.0f, 6.0f, 18.0f)
                curveTo(8.305f, 18.0f, 10.408f, 18.867f, 12.0f, 20.292f)
                moveTo(12.0f, 6.042f)
                curveTo(13.592f, 4.617f, 15.695f, 3.75f, 18.0f, 3.75f)
                curveTo(19.052f, 3.75f, 20.062f, 3.93f, 21.0f, 4.262f)
                verticalLineTo(18.512f)
                curveTo(20.062f, 18.181f, 19.052f, 18.0f, 18.0f, 18.0f)
                curveTo(15.695f, 18.0f, 13.592f, 18.867f, 12.0f, 20.292f)
                moveTo(12.0f, 6.042f)
                verticalLineTo(20.292f)
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
