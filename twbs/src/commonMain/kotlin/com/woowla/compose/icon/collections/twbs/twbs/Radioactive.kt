package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.0f, 1.0f)
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.653f, 5.496f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 5.0f)
                curveToRelative(-0.61f, 0.0f, -1.179f, 0.183f, -1.653f, 0.496f)
                lineTo(4.694f, 2.992f)
                arcTo(5.97f, 5.97f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(1.222f, 0.0f, 2.358f, 0.365f, 3.306f, 0.992f)
                close()
                moveTo(10.995f, 7.82f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.884f, 2.312f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.769f, 0.552f)
                lineToRelative(1.342f, 2.683f)
                curveToRelative(0.57f, -0.286f, 1.09f, -0.66f, 1.538f, -1.103f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.767f, -4.624f)
                close()
                moveTo(5.316f, 13.368f)
                lineTo(6.658f, 10.684f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.005f, 7.82f)
                lineToRelative(-2.994f, -0.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.306f, 5.728f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
