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

public val Twbs.VolumeUpFill: ImageVector
    get() {
        if (_volumeUpFill != null) {
            return _volumeUpFill!!
        }
        _volumeUpFill = Builder(name = "VolumeUpFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.536f, 14.01f)
                arcTo(8.47f, 8.47f, 0.0f, false, false, 14.026f, 8.0f)
                arcToRelative(8.47f, 8.47f, 0.0f, false, false, -2.49f, -6.01f)
                lineToRelative(-0.708f, 0.707f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 13.025f, 8.0f)
                curveToRelative(0.0f, 2.071f, -0.84f, 3.946f, -2.197f, 5.303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.121f, 12.596f)
                arcTo(6.48f, 6.48f, 0.0f, false, false, 12.025f, 8.0f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -1.904f, -4.596f)
                lineToRelative(-0.707f, 0.707f)
                arcTo(5.48f, 5.48f, 0.0f, false, true, 11.025f, 8.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, -1.61f, 3.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.707f, 11.182f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 10.025f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.318f, -3.182f)
                lineTo(8.0f, 5.525f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.025f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.0f, 10.475f)
                close()
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
            }
        }
        .build()
        return _volumeUpFill!!
    }

private var _volumeUpFill: ImageVector? = null
