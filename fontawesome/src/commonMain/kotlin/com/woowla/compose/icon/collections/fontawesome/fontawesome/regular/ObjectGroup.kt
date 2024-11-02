package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 115.8f)
                curveTo(38.2f, 107.0f, 32.0f, 94.2f, 32.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                curveToRelative(14.2f, 0.0f, 27.0f, 6.2f, 35.8f, 16.0f)
                lineToRelative(344.4f, 0.0f)
                curveToRelative(8.8f, -9.8f, 21.6f, -16.0f, 35.8f, -16.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                curveToRelative(0.0f, 14.2f, -6.2f, 27.0f, -16.0f, 35.8f)
                lineToRelative(0.0f, 280.4f)
                curveToRelative(9.8f, 8.8f, 16.0f, 21.6f, 16.0f, 35.8f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                curveToRelative(-14.2f, 0.0f, -27.0f, -6.2f, -35.8f, -16.0f)
                lineToRelative(-344.4f, 0.0f)
                curveToRelative(-8.8f, 9.8f, -21.6f, 16.0f, -35.8f, 16.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                curveToRelative(0.0f, -14.2f, 6.2f, -27.0f, 16.0f, -35.8f)
                lineToRelative(0.0f, -280.4f)
                close()
                moveTo(125.3f, 96.0f)
                curveToRelative(-4.8f, 13.6f, -15.6f, 24.4f, -29.3f, 29.3f)
                lineToRelative(0.0f, 261.5f)
                curveToRelative(13.6f, 4.8f, 24.4f, 15.6f, 29.3f, 29.3f)
                lineToRelative(325.5f, 0.0f)
                curveToRelative(4.8f, -13.6f, 15.6f, -24.4f, 29.3f, -29.3f)
                lineToRelative(0.0f, -261.5f)
                curveToRelative(-13.6f, -4.8f, -24.4f, -15.6f, -29.3f, -29.3f)
                lineTo(125.3f, 96.0f)
                close()
                moveTo(128.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(256.0f, 320.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
