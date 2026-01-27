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

public val SolidGroup.GridVertical: ImageVector
    get() {
        if (_gridVertical != null) {
            return _gridVertical!!
        }
        _gridVertical = Builder(name = "GridVertical", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 40.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineTo(40.0f, 0.0f)
                curveTo(17.9f, 0.0f, 0.0f, 17.9f, 0.0f, 40.0f)
                lineTo(0.0f, 88.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(128.0f, 232.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(0.0f, 424.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                close()
                moveTo(320.0f, 40.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineTo(232.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                close()
                moveTo(192.0f, 232.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                close()
                moveTo(320.0f, 424.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _gridVertical!!
    }

private var _gridVertical: ImageVector? = null
