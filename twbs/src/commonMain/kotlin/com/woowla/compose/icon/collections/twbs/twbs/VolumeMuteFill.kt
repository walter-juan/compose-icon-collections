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

public val Twbs.VolumeMuteFill: ImageVector
    get() {
        if (_volumeMuteFill != null) {
            return _volumeMuteFill!!
        }
        _volumeMuteFill = Builder(name = "VolumeMuteFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.717f, 3.55f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.812f, 0.39f)
                lineTo(3.825f, 10.5f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.0f, 10.0f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, -1.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.529f, -0.06f)
                moveToRelative(7.137f, 2.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineTo(12.207f, 8.0f)
                lineToRelative(1.647f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(11.5f, 8.707f)
                lineToRelative(-1.646f, 1.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineTo(10.793f, 8.0f)
                lineTo(9.146f, 6.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineTo(11.5f, 7.293f)
                lineToRelative(1.646f, -1.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
            }
        }
        .build()
        return _volumeMuteFill!!
    }

private var _volumeMuteFill: ImageVector? = null
