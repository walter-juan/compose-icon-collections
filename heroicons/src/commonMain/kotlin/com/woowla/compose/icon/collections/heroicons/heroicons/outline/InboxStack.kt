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

public val OutlineGroup.InboxStack: ImageVector
    get() {
        if (_inboxStack != null) {
            return _inboxStack!!
        }
        _inboxStack = Builder(name = "InboxStack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.875f, 14.25f)
                lineTo(9.089f, 16.192f)
                curveTo(9.5f, 16.85f, 10.221f, 17.25f, 10.997f, 17.25f)
                horizontalLineTo(13.003f)
                curveTo(13.779f, 17.25f, 14.5f, 16.85f, 14.911f, 16.192f)
                lineTo(16.125f, 14.25f)
                moveTo(2.41f, 9.0f)
                horizontalLineTo(7.046f)
                curveTo(7.798f, 9.0f, 8.501f, 9.376f, 8.918f, 10.002f)
                lineTo(9.082f, 10.248f)
                curveTo(9.499f, 10.874f, 10.202f, 11.25f, 10.954f, 11.25f)
                horizontalLineTo(13.046f)
                curveTo(13.798f, 11.25f, 14.501f, 10.874f, 14.918f, 10.248f)
                lineTo(15.082f, 10.002f)
                curveTo(15.499f, 9.376f, 16.202f, 9.0f, 16.954f, 9.0f)
                horizontalLineTo(21.59f)
                moveTo(2.41f, 9.0f)
                curveTo(2.305f, 9.263f, 2.25f, 9.545f, 2.25f, 9.832f)
                verticalLineTo(12.0f)
                curveTo(2.25f, 13.243f, 3.257f, 14.25f, 4.5f, 14.25f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 14.25f, 21.75f, 13.243f, 21.75f, 12.0f)
                verticalLineTo(9.832f)
                curveTo(21.75f, 9.545f, 21.695f, 9.263f, 21.59f, 9.0f)
                moveTo(2.41f, 9.0f)
                curveTo(2.501f, 8.772f, 2.629f, 8.558f, 2.792f, 8.368f)
                lineTo(6.077f, 4.536f)
                curveTo(6.504f, 4.037f, 7.128f, 3.75f, 7.785f, 3.75f)
                horizontalLineTo(16.215f)
                curveTo(16.872f, 3.75f, 17.496f, 4.037f, 17.924f, 4.536f)
                lineTo(21.208f, 8.368f)
                curveTo(21.371f, 8.558f, 21.499f, 8.772f, 21.59f, 9.0f)
                moveTo(4.5f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 20.25f, 21.75f, 19.243f, 21.75f, 18.0f)
                verticalLineTo(15.375f)
                curveTo(21.75f, 14.754f, 21.246f, 14.25f, 20.625f, 14.25f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 14.25f, 2.25f, 14.754f, 2.25f, 15.375f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 19.243f, 3.257f, 20.25f, 4.5f, 20.25f)
                close()
            }
        }
        .build()
        return _inboxStack!!
    }

private var _inboxStack: ImageVector? = null
