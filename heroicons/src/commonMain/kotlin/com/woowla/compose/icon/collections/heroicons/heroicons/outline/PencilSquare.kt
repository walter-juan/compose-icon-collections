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

public val OutlineGroup.PencilSquare: ImageVector
    get() {
        if (_pencilSquare != null) {
            return _pencilSquare!!
        }
        _pencilSquare = Builder(name = "PencilSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.862f, 4.487f)
                lineTo(18.549f, 2.799f)
                curveTo(19.281f, 2.067f, 20.469f, 2.067f, 21.201f, 2.799f)
                curveTo(21.933f, 3.531f, 21.933f, 4.719f, 21.201f, 5.451f)
                lineTo(10.582f, 16.069f)
                curveTo(10.054f, 16.598f, 9.401f, 16.987f, 8.685f, 17.2f)
                lineTo(6.0f, 18.0f)
                lineTo(6.8f, 15.315f)
                curveTo(7.013f, 14.599f, 7.402f, 13.946f, 7.931f, 13.418f)
                lineTo(16.862f, 4.487f)
                close()
                moveTo(16.862f, 4.487f)
                lineTo(19.5f, 7.125f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(18.75f)
                curveTo(18.0f, 19.993f, 16.993f, 21.0f, 15.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 21.0f, 3.0f, 19.993f, 3.0f, 18.75f)
                verticalLineTo(8.25f)
                curveTo(3.0f, 7.007f, 4.007f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(10.0f)
            }
        }
        .build()
        return _pencilSquare!!
    }

private var _pencilSquare: ImageVector? = null
