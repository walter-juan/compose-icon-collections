package com.woowla.compose.icon.collections.devicons.devicons.haskell

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
import com.woowla.compose.icon.collections.devicons.devicons.HaskellGroup

public val HaskellGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 110.2f)
                lineTo(30.1f, 65.0f)
                lineTo(0.0f, 19.9f)
                horizontalLineToRelative(22.6f)
                lineTo(52.7f, 65.0f)
                lineToRelative(-30.1f, 45.1f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.1f, 110.2f)
                lineTo(60.2f, 65.0f)
                lineTo(30.1f, 19.9f)
                horizontalLineToRelative(22.6f)
                lineToRelative(60.2f, 90.3f)
                horizontalLineTo(90.4f)
                lineTo(71.5f, 81.9f)
                lineToRelative(-18.8f, 28.2f)
                horizontalLineTo(30.1f)
                close()
                moveTo(102.9f, 83.8f)
                lineToRelative(-10.0f, -15.1f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(15.1f)
                horizontalLineToRelative(-25.1f)
                close()
                moveTo(87.8f, 61.3f)
                lineToRelative(-10.0f, -15.1f)
                horizontalLineTo(128.0f)
                verticalLineToRelative(15.1f)
                horizontalLineTo(87.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
