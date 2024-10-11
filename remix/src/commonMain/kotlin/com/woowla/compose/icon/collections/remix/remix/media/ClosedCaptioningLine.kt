package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.ClosedCaptioningLine: ImageVector
    get() {
        if (_closedCaptioningLine != null) {
            return _closedCaptioningLine!!
        }
        _closedCaptioningLine = Builder(name = "ClosedCaptioningLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(10.104f, 8.0f, 11.105f, 8.448f, 11.829f, 9.173f)
                lineTo(10.415f, 10.587f)
                curveTo(10.053f, 10.224f, 9.553f, 10.0f, 9.0f, 10.0f)
                curveTo(7.895f, 10.0f, 7.0f, 10.895f, 7.0f, 12.0f)
                curveTo(7.0f, 13.105f, 7.895f, 14.0f, 9.0f, 14.0f)
                curveTo(9.552f, 14.0f, 10.052f, 13.776f, 10.414f, 13.414f)
                lineTo(11.828f, 14.828f)
                curveTo(11.104f, 15.552f, 10.104f, 16.0f, 9.0f, 16.0f)
                curveTo(6.792f, 16.0f, 5.0f, 14.208f, 5.0f, 12.0f)
                curveTo(5.0f, 9.792f, 6.792f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(17.104f, 8.0f, 18.105f, 8.448f, 18.829f, 9.173f)
                lineTo(17.415f, 10.587f)
                curveTo(17.053f, 10.224f, 16.553f, 10.0f, 16.0f, 10.0f)
                curveTo(14.895f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 14.895f, 14.0f, 16.0f, 14.0f)
                curveTo(16.552f, 14.0f, 17.052f, 13.776f, 17.414f, 13.414f)
                lineTo(18.828f, 14.828f)
                curveTo(18.104f, 15.552f, 17.104f, 16.0f, 16.0f, 16.0f)
                curveTo(13.792f, 16.0f, 12.0f, 14.208f, 12.0f, 12.0f)
                curveTo(12.0f, 9.792f, 13.792f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _closedCaptioningLine!!
    }

private var _closedCaptioningLine: ImageVector? = null
