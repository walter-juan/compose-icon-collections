package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.DiscussLine: ImageVector
    get() {
        if (_discussLine != null) {
            return _discussLine!!
        }
        _discussLine = Builder(name = "DiscussLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.5f)
                lineTo(11.2f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 19.0f, 5.0f, 18.552f, 5.0f, 18.0f)
                verticalLineTo(7.103f)
                curveTo(5.0f, 6.55f, 5.448f, 6.103f, 6.0f, 6.103f)
                horizontalLineTo(22.0f)
                curveTo(22.552f, 6.103f, 23.0f, 6.55f, 23.0f, 7.103f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 18.552f, 22.552f, 19.0f, 22.0f, 19.0f)
                horizontalLineTo(16.8f)
                lineTo(14.0f, 22.5f)
                close()
                moveTo(15.839f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.103f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.2f)
                horizontalLineTo(12.161f)
                lineTo(14.0f, 19.298f)
                lineTo(15.839f, 17.0f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                curveTo(1.0f, 2.448f, 1.448f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _discussLine!!
    }

private var _discussLine: ImageVector? = null
