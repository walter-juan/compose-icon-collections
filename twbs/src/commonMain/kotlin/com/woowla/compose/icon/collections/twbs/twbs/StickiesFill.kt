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

public val Twbs.StickiesFill: ImageVector
    get() {
        if (_stickiesFill != null) {
            return _stickiesFill!!
        }
        _stickiesFill = Builder(name = "StickiesFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.5f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 1.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 3.5f)
                verticalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 16.0f)
                horizontalLineToRelative(6.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.06f, -0.44f)
                lineToRelative(4.915f, -4.914f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 9.586f)
                lineTo(16.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 2.0f)
                close()
                moveTo(9.5f, 10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, 0.427f)
                lineToRelative(-5.146f, 5.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, -0.177f)
                close()
            }
        }
        .build()
        return _stickiesFill!!
    }

private var _stickiesFill: ImageVector? = null
