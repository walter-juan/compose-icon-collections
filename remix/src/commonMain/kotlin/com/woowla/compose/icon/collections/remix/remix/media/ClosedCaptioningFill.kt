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

public val MediaGroup.ClosedCaptioningFill: ImageVector
    get() {
        if (_closedCaptioningFill != null) {
            return _closedCaptioningFill!!
        }
        _closedCaptioningFill = Builder(name = "ClosedCaptioningFill", defaultWidth = 24.0.dp,
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
                moveTo(9.0f, 8.0f)
                curveTo(6.792f, 8.0f, 5.0f, 9.792f, 5.0f, 12.0f)
                curveTo(5.0f, 14.208f, 6.792f, 16.0f, 9.0f, 16.0f)
                curveTo(10.1f, 16.0f, 11.1f, 15.55f, 11.828f, 14.828f)
                lineTo(10.414f, 13.414f)
                curveTo(10.052f, 13.776f, 9.552f, 14.0f, 9.0f, 14.0f)
                curveTo(7.895f, 14.0f, 7.0f, 13.105f, 7.0f, 12.0f)
                curveTo(7.0f, 10.895f, 7.895f, 10.0f, 9.0f, 10.0f)
                curveTo(9.55f, 10.0f, 10.048f, 10.22f, 10.415f, 10.587f)
                lineTo(11.829f, 9.173f)
                curveTo(11.105f, 8.448f, 10.104f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(13.792f, 8.0f, 12.0f, 9.792f, 12.0f, 12.0f)
                curveTo(12.0f, 14.208f, 13.792f, 16.0f, 16.0f, 16.0f)
                curveTo(17.104f, 16.0f, 18.104f, 15.552f, 18.828f, 14.828f)
                lineTo(17.414f, 13.414f)
                curveTo(17.052f, 13.776f, 16.552f, 14.0f, 16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 14.895f, 10.0f, 16.0f, 10.0f)
                curveTo(16.553f, 10.0f, 17.053f, 10.224f, 17.415f, 10.587f)
                lineTo(18.829f, 9.173f)
                curveTo(18.105f, 8.448f, 17.104f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _closedCaptioningFill!!
    }

private var _closedCaptioningFill: ImageVector? = null
