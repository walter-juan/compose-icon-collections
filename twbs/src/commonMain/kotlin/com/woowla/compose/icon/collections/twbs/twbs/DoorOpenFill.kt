package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.DoorOpenFill: ImageVector
    get() {
        if (_doorOpenFill != null) {
            return _doorOpenFill!!
        }
        _doorOpenFill = Builder(name = "DoorOpenFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 1.0f)
                lineTo(11.0f, 1.0f)
                lineTo(11.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.57f, -0.495f)
                lineToRelative(-7.0f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 1.5f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(12.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(8.5f, 10.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.448f, -0.5f, -1.0f)
                reflectiveCurveToRelative(0.224f, -1.0f, 0.5f, -1.0f)
                reflectiveCurveToRelative(0.5f, 0.448f, 0.5f, 1.0f)
                reflectiveCurveToRelative(-0.224f, 1.0f, -0.5f, 1.0f)
            }
        }
        .build()
        return _doorOpenFill!!
    }

private var _doorOpenFill: ImageVector? = null
