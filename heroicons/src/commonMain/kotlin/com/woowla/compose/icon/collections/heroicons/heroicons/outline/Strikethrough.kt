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

public val OutlineGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(11.894f, 11.976f, 11.788f, 11.95f, 11.682f, 11.921f)
                curveTo(10.097f, 11.497f, 8.778f, 10.674f, 7.921f, 9.685f)
                curveTo(7.049f, 8.676f, 6.657f, 7.495f, 6.954f, 6.384f)
                curveTo(7.544f, 4.183f, 10.617f, 3.095f, 13.817f, 3.952f)
                curveTo(14.84f, 4.226f, 15.752f, 4.666f, 16.5f, 5.209f)
                moveTo(6.421f, 17.812f)
                curveTo(7.278f, 18.801f, 8.597f, 19.623f, 10.182f, 20.048f)
                curveTo(13.383f, 20.906f, 16.456f, 19.817f, 17.045f, 17.617f)
                curveTo(17.278f, 16.749f, 17.09f, 15.838f, 16.58f, 15.0f)
                moveTo(3.75f, 12.0f)
                horizontalLineTo(20.25f)
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
