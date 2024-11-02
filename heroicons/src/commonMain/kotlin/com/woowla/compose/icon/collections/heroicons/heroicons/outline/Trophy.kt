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

public val OutlineGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 18.75f)
                horizontalLineTo(7.5f)
                moveTo(16.5f, 18.75f)
                curveTo(18.157f, 18.75f, 19.5f, 20.093f, 19.5f, 21.75f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 20.093f, 5.843f, 18.75f, 7.5f, 18.75f)
                moveTo(16.5f, 18.75f)
                verticalLineTo(15.375f)
                curveTo(16.5f, 14.754f, 15.997f, 14.25f, 15.375f, 14.25f)
                horizontalLineTo(14.504f)
                moveTo(7.5f, 18.75f)
                verticalLineTo(15.375f)
                curveTo(7.5f, 14.754f, 8.004f, 14.25f, 8.625f, 14.25f)
                horizontalLineTo(9.497f)
                moveTo(14.504f, 14.25f)
                horizontalLineTo(9.497f)
                moveTo(14.504f, 14.25f)
                curveTo(13.956f, 13.304f, 13.61f, 12.227f, 13.522f, 11.078f)
                moveTo(9.497f, 14.25f)
                curveTo(10.044f, 13.304f, 10.391f, 12.227f, 10.478f, 11.078f)
                moveTo(5.25f, 4.236f)
                curveTo(4.268f, 4.379f, 3.296f, 4.553f, 2.334f, 4.756f)
                curveTo(2.785f, 7.423f, 4.995f, 9.493f, 7.73f, 9.728f)
                moveTo(5.25f, 4.236f)
                verticalLineTo(4.5f)
                curveTo(5.25f, 6.608f, 6.216f, 8.49f, 7.73f, 9.728f)
                moveTo(5.25f, 4.236f)
                verticalLineTo(2.721f)
                curveTo(7.456f, 2.411f, 9.709f, 2.25f, 12.0f, 2.25f)
                curveTo(14.291f, 2.25f, 16.545f, 2.411f, 18.75f, 2.721f)
                verticalLineTo(4.236f)
                moveTo(7.73f, 9.728f)
                curveTo(8.517f, 10.372f, 9.453f, 10.842f, 10.478f, 11.078f)
                moveTo(18.75f, 4.236f)
                verticalLineTo(4.5f)
                curveTo(18.75f, 6.608f, 17.784f, 8.49f, 16.271f, 9.728f)
                moveTo(18.75f, 4.236f)
                curveTo(19.733f, 4.379f, 20.705f, 4.553f, 21.666f, 4.756f)
                curveTo(21.216f, 7.423f, 19.005f, 9.493f, 16.271f, 9.728f)
                moveTo(16.271f, 9.728f)
                curveTo(15.483f, 10.372f, 14.547f, 10.842f, 13.522f, 11.078f)
                moveTo(13.522f, 11.078f)
                curveTo(13.033f, 11.19f, 12.524f, 11.25f, 12.0f, 11.25f)
                curveTo(11.477f, 11.25f, 10.967f, 11.19f, 10.478f, 11.078f)
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
