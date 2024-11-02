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

public val OutlineGroup.InformationCircle: ImageVector
    get() {
        if (_informationCircle != null) {
            return _informationCircle!!
        }
        _informationCircle = Builder(name = "InformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.25f, 11.25f)
                lineTo(11.292f, 11.229f)
                curveTo(11.865f, 10.943f, 12.51f, 11.46f, 12.354f, 12.082f)
                lineTo(11.646f, 14.918f)
                curveTo(11.49f, 15.54f, 12.135f, 16.057f, 12.708f, 15.771f)
                lineTo(12.75f, 15.75f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
                moveTo(12.0f, 8.25f)
                horizontalLineTo(12.007f)
                verticalLineTo(8.257f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.25f)
                close()
            }
        }
        .build()
        return _informationCircle!!
    }

private var _informationCircle: ImageVector? = null
