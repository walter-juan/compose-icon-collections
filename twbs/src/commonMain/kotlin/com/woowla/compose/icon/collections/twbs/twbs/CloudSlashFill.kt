package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudSlashFill: ImageVector
    get() {
        if (_cloudSlashFill != null) {
            return _cloudSlashFill!!
        }
        _cloudSlashFill = Builder(name = "CloudSlashFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.112f, 5.112f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.17f, 0.613f)
                curveTo(1.266f, 6.095f, 0.0f, 7.555f, 0.0f, 9.318f)
                curveTo(0.0f, 11.366f, 1.708f, 13.0f, 3.781f, 13.0f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(14.484f, 12.484f)
                lineTo(4.937f, 2.937f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(2.69f, 0.0f, 4.923f, 2.0f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16.0f, 8.137f, 16.0f, 9.773f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -1.516f, 2.711f)
                moveToRelative(-0.838f, 1.87f)
                lineToRelative(-12.0f, -12.0f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudSlashFill!!
    }

private var _cloudSlashFill: ImageVector? = null
