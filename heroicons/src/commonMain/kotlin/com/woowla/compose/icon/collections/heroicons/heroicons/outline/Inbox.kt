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

public val OutlineGroup.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 13.5f)
                horizontalLineTo(6.109f)
                curveTo(6.962f, 13.5f, 7.741f, 13.981f, 8.122f, 14.744f)
                lineTo(8.378f, 15.256f)
                curveTo(8.759f, 16.018f, 9.538f, 16.5f, 10.391f, 16.5f)
                horizontalLineTo(13.609f)
                curveTo(14.462f, 16.5f, 15.241f, 16.018f, 15.622f, 15.256f)
                lineTo(15.878f, 14.744f)
                curveTo(16.259f, 13.981f, 17.038f, 13.5f, 17.891f, 13.5f)
                horizontalLineTo(21.75f)
                moveTo(2.25f, 13.838f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.243f, 3.257f, 20.25f, 4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 20.25f, 21.75f, 19.243f, 21.75f, 18.0f)
                verticalLineTo(13.838f)
                curveTo(21.75f, 13.614f, 21.716f, 13.391f, 21.65f, 13.177f)
                lineTo(19.239f, 5.338f)
                curveTo(18.948f, 4.394f, 18.076f, 3.75f, 17.088f, 3.75f)
                horizontalLineTo(6.912f)
                curveTo(5.924f, 3.75f, 5.052f, 4.394f, 4.761f, 5.338f)
                lineTo(2.349f, 13.177f)
                curveTo(2.284f, 13.391f, 2.25f, 13.614f, 2.25f, 13.838f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
