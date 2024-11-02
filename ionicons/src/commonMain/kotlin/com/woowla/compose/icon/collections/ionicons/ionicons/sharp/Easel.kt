package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

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
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Easel: ImageVector
    get() {
        if (_easel != null) {
            return _easel!!
        }
        _easel = Builder(name = "Easel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.0f, 64.0f)
                horizontalLineTo(278.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 76.0f)
                verticalLineTo(356.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(78.19f)
                lineTo(89.93f, 470.46f)
                lineToRelative(36.53f, 9.61f)
                lineTo(161.74f, 368.0f)
                horizontalLineTo(234.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(71.84f)
                lineToRelative(31.0f, 111.7f)
                lineToRelative(36.83f, -8.57f)
                lineTo(389.05f, 368.0f)
                horizontalLineTo(468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 468.0f, 64.0f)
                close()
                moveTo(442.0f, 330.0f)
                horizontalLineTo(70.0f)
                verticalLineTo(102.0f)
                horizontalLineTo(442.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 120.0f)
                horizontalLineToRelative(336.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(-336.0f)
                close()
            }
        }
        .build()
        return _easel!!
    }

private var _easel: ImageVector? = null
