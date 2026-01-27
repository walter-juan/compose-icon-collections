package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 43.0f, 43.0f, 0.0f, 96.0f, 0.0f)
                lineTo(288.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineToRelative(0.0f, 256.0f)
                curveToRelative(0.0f, 40.1f, -24.6f, 74.5f, -59.5f, 88.8f)
                lineToRelative(53.9f, 63.7f)
                curveToRelative(8.6f, 10.1f, 7.3f, 25.3f, -2.8f, 33.8f)
                reflectiveCurveToRelative(-25.3f, 7.3f, -33.8f, -2.8f)
                lineToRelative(-74.0f, -87.5f)
                lineToRelative(-151.3f, 0.0f)
                lineToRelative(-74.0f, 87.5f)
                curveToRelative(-8.6f, 10.1f, -23.7f, 11.4f, -33.8f, 2.8f)
                reflectiveCurveToRelative(-11.4f, -23.7f, -2.8f, -33.8f)
                lineToRelative(53.9f, -63.7f)
                curveTo(24.6f, 426.5f, 0.0f, 392.1f, 0.0f, 352.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(64.0f, 128.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(192.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
