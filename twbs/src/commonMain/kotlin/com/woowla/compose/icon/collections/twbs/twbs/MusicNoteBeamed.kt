package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.MusicNoteBeamed: ImageVector
    get() {
        if (_musicNoteBeamed != null) {
            return _musicNoteBeamed!!
        }
        _musicNoteBeamed = Builder(name = "MusicNoteBeamed", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 13.0f)
                curveToRelative(0.0f, 1.105f, -1.12f, 2.0f, -2.5f, 2.0f)
                reflectiveCurveTo(1.0f, 14.105f, 1.0f, 13.0f)
                reflectiveCurveToRelative(1.12f, -2.0f, 2.5f, -2.0f)
                reflectiveCurveToRelative(2.5f, 0.896f, 2.5f, 2.0f)
                moveToRelative(9.0f, -2.0f)
                curveToRelative(0.0f, 1.105f, -1.12f, 2.0f, -2.5f, 2.0f)
                reflectiveCurveToRelative(-2.5f, -0.895f, -2.5f, -2.0f)
                reflectiveCurveToRelative(1.12f, -2.0f, 2.5f, -2.0f)
                reflectiveCurveToRelative(2.5f, 0.895f, 2.5f, 2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 11.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(6.0f, 3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.905f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.9f, -0.995f)
                lineToRelative(8.0f, -0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.1f, 0.995f)
                verticalLineTo(3.0f)
                lineTo(5.0f, 4.0f)
                close()
            }
        }
        .build()
        return _musicNoteBeamed!!
    }

private var _musicNoteBeamed: ImageVector? = null
