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

public val Twbs.FileZip: ImageVector
    get() {
        if (_fileZip != null) {
            return _fileZip!!
        }
        _fileZip = Builder(name = "FileZip", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(0.938f)
                lineToRelative(0.4f, 1.599f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.416f, 1.074f)
                lineToRelative(-0.93f, 0.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.109f, 0.0f)
                lineToRelative(-0.93f, -0.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.415f, -1.074f)
                lineToRelative(0.4f, -1.599f)
                close()
                moveTo(8.5f, 7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.938f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.03f, 0.243f)
                lineToRelative(-0.4f, 1.598f)
                lineToRelative(0.93f, 0.62f)
                lineToRelative(0.93f, -0.62f)
                lineToRelative(-0.4f, -1.598f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.03f, -0.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(7.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.5f, 6.0f)
                lineTo(7.5f, 5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.5f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(7.5f, 3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.5f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
