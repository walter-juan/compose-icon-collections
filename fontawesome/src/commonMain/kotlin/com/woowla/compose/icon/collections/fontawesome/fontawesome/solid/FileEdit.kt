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

public val SolidGroup.FileEdit: ImageVector
    get() {
        if (_fileEdit != null) {
            return _fileEdit!!
        }
        _fileEdit = Builder(name = "FileEdit", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(146.2f, 0.0f)
                lineToRelative(10.9f, -54.5f)
                curveToRelative(4.3f, -21.7f, 15.0f, -41.6f, 30.6f, -57.2f)
                lineToRelative(132.2f, -132.2f)
                lineToRelative(0.0f, -97.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(322.8f, 18.7f)
                curveTo(310.8f, 6.7f, 294.5f, 0.0f, 277.6f, 0.0f)
                lineTo(128.1f, 0.0f)
                close()
                moveTo(389.6f, 176.0f)
                lineToRelative(-93.5f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -93.5f)
                lineToRelative(117.5f, 117.5f)
                close()
                moveTo(332.3f, 466.9f)
                lineToRelative(-11.9f, 59.6f)
                curveToRelative(-0.2f, 0.9f, -0.3f, 1.9f, -0.3f, 2.9f)
                curveToRelative(0.0f, 8.0f, 6.5f, 14.6f, 14.6f, 14.6f)
                curveToRelative(1.0f, 0.0f, 1.9f, -0.1f, 2.9f, -0.3f)
                lineToRelative(59.6f, -11.9f)
                curveToRelative(12.4f, -2.5f, 23.8f, -8.6f, 32.7f, -17.5f)
                lineToRelative(118.9f, -118.9f)
                lineToRelative(-80.0f, -80.0f)
                lineToRelative(-118.9f, 118.9f)
                curveToRelative(-8.9f, 8.9f, -15.0f, 20.3f, -17.5f, 32.7f)
                close()
                moveTo(600.1f, 343.9f)
                curveToRelative(22.1f, -22.1f, 22.1f, -57.9f, 0.0f, -80.0f)
                reflectiveCurveToRelative(-57.9f, -22.1f, -80.0f, 0.0f)
                lineToRelative(-28.8f, 28.8f)
                lineToRelative(80.0f, 80.0f)
                lineToRelative(28.8f, -28.8f)
                close()
            }
        }
        .build()
        return _fileEdit!!
    }

private var _fileEdit: ImageVector? = null
