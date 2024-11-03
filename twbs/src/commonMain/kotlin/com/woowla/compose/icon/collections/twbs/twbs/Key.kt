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

public val Twbs.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.465f, -2.0f)
                horizontalLineTo(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.354f, 0.146f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(13.0f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(11.0f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(9.0f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 10.0f)
                horizontalLineToRelative(-0.535f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                moveToRelative(4.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.712f, 4.285f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.163f, 9.0f)
                horizontalLineToRelative(0.63f)
                lineToRelative(0.853f, -0.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.793f, -0.793f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-6.63f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.451f, -0.285f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
