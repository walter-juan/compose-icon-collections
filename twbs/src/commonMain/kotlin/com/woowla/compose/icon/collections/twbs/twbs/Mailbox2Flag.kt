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

public val Twbs.Mailbox2Flag: ImageVector
    get() {
        if (_mailbox2Flag != null) {
            return _mailbox2Flag!!
        }
        _mailbox2Flag = Builder(name = "Mailbox2Flag", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 8.5f)
                verticalLineTo(3.707f)
                lineToRelative(0.854f, -0.853f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.5f, 2.5f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.0f, 0.0f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.646f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                verticalLineTo(3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                moveToRelative(0.585f, 4.157f)
                curveTo(4.836f, 7.264f, 5.0f, 7.334f, 5.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveToRelative(0.0f, 0.334f, 0.164f, 0.264f, 0.415f, 0.157f)
                curveTo(3.58f, 7.087f, 3.782f, 7.0f, 4.0f, 7.0f)
                reflectiveCurveToRelative(0.42f, 0.086f, 0.585f, 0.157f)
            }
        }
        .build()
        return _mailbox2Flag!!
    }

private var _mailbox2Flag: ImageVector? = null
