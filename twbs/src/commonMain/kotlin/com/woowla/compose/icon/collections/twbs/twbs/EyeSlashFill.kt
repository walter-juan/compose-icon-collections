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

public val Twbs.EyeSlashFill: ImageVector
    get() {
        if (_eyeSlashFill != null) {
            return _eyeSlashFill!!
        }
        _eyeSlashFill = Builder(name = "EyeSlashFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.79f, 12.912f)
                lineToRelative(-1.614f, -1.615f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.474f, -4.474f)
                lineToRelative(-2.06f, -2.06f)
                curveTo(0.938f, 6.278f, 0.0f, 8.0f, 0.0f, 8.0f)
                reflectiveCurveToRelative(3.0f, 5.5f, 8.0f, 5.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 2.79f, -0.588f)
                moveTo(5.21f, 3.088f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 2.5f)
                curveToRelative(5.0f, 0.0f, 8.0f, 5.5f, 8.0f, 5.5f)
                reflectiveCurveToRelative(-0.939f, 1.721f, -2.641f, 3.238f)
                lineToRelative(-2.062f, -2.062f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.474f, -4.474f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.525f, 7.646f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.829f, 2.829f)
                close()
                moveTo(10.475f, 8.354f)
                lineTo(7.646f, 5.524f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.829f, 2.829f)
                close()
                moveTo(13.646f, 14.354f)
                lineTo(1.646f, 2.354f)
                lineTo(2.354f, 1.646f)
                lineTo(14.354f, 13.646f)
                close()
            }
        }
        .build()
        return _eyeSlashFill!!
    }

private var _eyeSlashFill: ImageVector? = null
