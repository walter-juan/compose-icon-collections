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

public val Twbs.AwardFill: ImageVector
    get() {
        if (_awardFill != null) {
            return _awardFill!!
        }
        _awardFill = Builder(name = "AwardFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                lineToRelative(1.669f, 0.864f)
                lineToRelative(1.858f, 0.282f)
                lineToRelative(0.842f, 1.68f)
                lineToRelative(1.337f, 1.32f)
                lineTo(13.4f, 6.0f)
                lineToRelative(0.306f, 1.854f)
                lineToRelative(-1.337f, 1.32f)
                lineToRelative(-0.842f, 1.68f)
                lineToRelative(-1.858f, 0.282f)
                lineTo(8.0f, 12.0f)
                lineToRelative(-1.669f, -0.864f)
                lineToRelative(-1.858f, -0.282f)
                lineToRelative(-0.842f, -1.68f)
                lineToRelative(-1.337f, -1.32f)
                lineTo(2.6f, 6.0f)
                lineToRelative(-0.306f, -1.854f)
                lineToRelative(1.337f, -1.32f)
                lineToRelative(0.842f, -1.68f)
                lineTo(6.331f, 0.864f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.794f)
                verticalLineTo(16.0f)
                lineToRelative(4.0f, -1.0f)
                lineToRelative(4.0f, 1.0f)
                verticalLineToRelative(-4.206f)
                lineToRelative(-2.018f, 0.306f)
                lineTo(8.0f, 13.126f)
                lineTo(6.018f, 12.1f)
                close()
            }
        }
        .build()
        return _awardFill!!
    }

private var _awardFill: ImageVector? = null
