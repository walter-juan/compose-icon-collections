package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.MailOpened: ImageVector
    get() {
        if (_mailOpened != null) {
            return _mailOpened!!
        }
        _mailOpened = Builder(name = "MailOpened", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.872f, 14.287f)
                lineToRelative(6.522f, 6.52f)
                arcToRelative(2.996f, 2.996f, 0.0f, false, true, -2.218f, 1.188f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, true, -2.394f, -1.191f)
                lineToRelative(6.521f, -6.522f)
                lineToRelative(2.318f, 1.545f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.878f, 0.0f)
                lineToRelative(0.116f, -0.066f)
                lineToRelative(2.317f, -1.545f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.535f)
                lineToRelative(5.429f, 3.62f)
                lineToRelative(-5.429f, 5.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.535f)
                verticalLineToRelative(9.05f)
                lineToRelative(-5.43f, -5.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.44f, 2.102f)
                lineToRelative(0.115f, 0.066f)
                lineToRelative(8.444f, 5.629f)
                lineToRelative(-8.999f, 6.0f)
                lineToRelative(-9.0f, -6.0f)
                lineToRelative(8.445f, -5.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.994f, -0.065f)
                close()
            }
        }
        .build()
        return _mailOpened!!
    }

private var _mailOpened: ImageVector? = null
