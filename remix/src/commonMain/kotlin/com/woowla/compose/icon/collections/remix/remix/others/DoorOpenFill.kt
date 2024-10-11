package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.DoorOpenFill: ImageVector
    get() {
        if (_doorOpenFill != null) {
            return _doorOpenFill!!
        }
        _doorOpenFill = Builder(name = "DoorOpenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.998f, 21.0f)
                verticalLineTo(19.0f)
                lineTo(3.998f, 19.0f)
                verticalLineTo(4.835f)
                curveTo(3.998f, 4.351f, 4.344f, 3.937f, 4.819f, 3.851f)
                lineTo(14.291f, 2.129f)
                curveTo(14.617f, 2.069f, 14.929f, 2.286f, 14.988f, 2.612f)
                curveTo(14.995f, 2.647f, 14.998f, 2.683f, 14.998f, 2.719f)
                verticalLineTo(4.0f)
                lineTo(18.998f, 4.0f)
                curveTo(19.55f, 4.0f, 19.998f, 4.448f, 19.998f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(21.998f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(6.0f)
                lineTo(14.998f, 6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.998f)
                close()
                moveTo(11.998f, 11.0f)
                horizontalLineTo(9.998f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.998f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _doorOpenFill!!
    }

private var _doorOpenFill: ImageVector? = null
