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

public val OutlineGroup.ViewfinderCircle: ImageVector
    get() {
        if (_viewfinderCircle != null) {
            return _viewfinderCircle!!
        }
        _viewfinderCircle = Builder(name = "ViewfinderCircle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 3.75f)
                horizontalLineTo(6.0f)
                curveTo(4.757f, 3.75f, 3.75f, 4.757f, 3.75f, 6.0f)
                verticalLineTo(7.5f)
                moveTo(16.5f, 3.75f)
                horizontalLineTo(18.0f)
                curveTo(19.243f, 3.75f, 20.25f, 4.757f, 20.25f, 6.0f)
                verticalLineTo(7.5f)
                moveTo(20.25f, 16.5f)
                verticalLineTo(18.0f)
                curveTo(20.25f, 19.243f, 19.243f, 20.25f, 18.0f, 20.25f)
                horizontalLineTo(16.5f)
                moveTo(7.5f, 20.25f)
                horizontalLineTo(6.0f)
                curveTo(4.757f, 20.25f, 3.75f, 19.243f, 3.75f, 18.0f)
                verticalLineTo(16.5f)
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _viewfinderCircle!!
    }

private var _viewfinderCircle: ImageVector? = null
