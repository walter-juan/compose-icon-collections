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

public val OutlineGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.5f)
                lineTo(12.0f, 9.75f)
                moveTo(12.0f, 9.75f)
                lineTo(15.0f, 12.75f)
                moveTo(12.0f, 9.75f)
                lineTo(9.0f, 12.75f)
                moveTo(6.75f, 19.5f)
                curveTo(4.265f, 19.5f, 2.25f, 17.485f, 2.25f, 15.0f)
                curveTo(2.25f, 13.007f, 3.546f, 11.317f, 5.34f, 10.725f)
                curveTo(5.281f, 10.409f, 5.25f, 10.083f, 5.25f, 9.75f)
                curveTo(5.25f, 6.851f, 7.601f, 4.5f, 10.5f, 4.5f)
                curveTo(12.931f, 4.5f, 14.976f, 6.153f, 15.574f, 8.396f)
                curveTo(15.865f, 8.301f, 16.177f, 8.25f, 16.5f, 8.25f)
                curveTo(18.157f, 8.25f, 19.5f, 9.593f, 19.5f, 11.25f)
                curveTo(19.5f, 11.598f, 19.441f, 11.932f, 19.332f, 12.243f)
                curveTo(20.745f, 12.781f, 21.75f, 14.148f, 21.75f, 15.75f)
                curveTo(21.75f, 17.821f, 20.071f, 19.5f, 18.0f, 19.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
