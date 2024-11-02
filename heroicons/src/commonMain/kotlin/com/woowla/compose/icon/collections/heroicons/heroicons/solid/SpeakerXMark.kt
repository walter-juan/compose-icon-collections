package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.SpeakerXMark: ImageVector
    get() {
        if (_speakerXMark != null) {
            return _speakerXMark!!
        }
        _speakerXMark = Builder(name = "SpeakerXMark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 4.061f)
                curveTo(13.5f, 2.724f, 11.884f, 2.055f, 10.939f, 3.0f)
                lineTo(6.439f, 7.5f)
                horizontalLineTo(4.509f)
                curveTo(3.368f, 7.5f, 2.191f, 8.164f, 1.849f, 9.405f)
                curveTo(1.621f, 10.232f, 1.5f, 11.102f, 1.5f, 12.0f)
                curveTo(1.5f, 12.898f, 1.621f, 13.768f, 1.849f, 14.595f)
                curveTo(2.191f, 15.836f, 3.368f, 16.5f, 4.509f, 16.5f)
                horizontalLineTo(6.439f)
                lineTo(10.939f, 21.0f)
                curveTo(11.884f, 21.945f, 13.5f, 21.276f, 13.5f, 19.939f)
                verticalLineTo(4.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.78f, 9.22f)
                curveTo(17.487f, 8.927f, 17.013f, 8.927f, 16.72f, 9.22f)
                curveTo(16.427f, 9.513f, 16.427f, 9.987f, 16.72f, 10.28f)
                lineTo(18.439f, 12.0f)
                lineTo(16.72f, 13.72f)
                curveTo(16.427f, 14.013f, 16.427f, 14.488f, 16.72f, 14.78f)
                curveTo(17.013f, 15.073f, 17.487f, 15.073f, 17.78f, 14.78f)
                lineTo(19.5f, 13.061f)
                lineTo(21.22f, 14.78f)
                curveTo(21.513f, 15.073f, 21.987f, 15.073f, 22.28f, 14.78f)
                curveTo(22.573f, 14.488f, 22.573f, 14.013f, 22.28f, 13.72f)
                lineTo(20.561f, 12.0f)
                lineTo(22.28f, 10.28f)
                curveTo(22.573f, 9.987f, 22.573f, 9.513f, 22.28f, 9.22f)
                curveTo(21.987f, 8.927f, 21.513f, 8.927f, 21.22f, 9.22f)
                lineTo(19.5f, 10.939f)
                lineTo(17.78f, 9.22f)
                close()
            }
        }
        .build()
        return _speakerXMark!!
    }

private var _speakerXMark: ImageVector? = null
