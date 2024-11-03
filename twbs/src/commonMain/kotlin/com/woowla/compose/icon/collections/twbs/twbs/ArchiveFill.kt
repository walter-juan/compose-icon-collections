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

public val Twbs.ArchiveFill: ImageVector
    get() {
        if (_archiveFill != null) {
            return _archiveFill!!
        }
        _archiveFill = Builder(name = "ArchiveFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.643f, 15.0f)
                curveTo(13.979f, 15.0f, 15.0f, 13.845f, 15.0f, 12.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(7.5f)
                curveTo(1.0f, 13.845f, 2.021f, 15.0f, 3.357f, 15.0f)
                close()
                moveTo(5.5f, 7.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveTo(0.8f, 1.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.8f, 0.8f)
                verticalLineTo(3.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.8f, 0.8f)
                horizontalLineToRelative(14.4f)
                arcTo(0.8f, 0.8f, 0.0f, false, false, 16.0f, 3.0f)
                verticalLineTo(1.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.8f, -0.8f)
                close()
            }
        }
        .build()
        return _archiveFill!!
    }

private var _archiveFill: ImageVector? = null
